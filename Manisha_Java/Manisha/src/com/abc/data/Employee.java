package com.abc.data;

import java.util.HashSet;
import java.util.Set;

public class Employee
{
    private long employeeId;
    private String employeeName;
    private String department; 
    private Set<Project> empProject;

	public Employee(long employeeId, String employeeName, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	
	public boolean addProjects(Project p)
    {
    	if(empProject == null)
    		empProject = new HashSet<Project>();
    	return empProject.add(p);
    }
    public boolean removeProjects(Project p)
    {
    	if(empProject == null)
    		empProject = new HashSet<Project>();
    	return empProject.remove(p);
    }
    public void print()
    {
    	for(Project p : empProject)
    		System.out.println(p);
    }
    
    
    public long getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

	
}

