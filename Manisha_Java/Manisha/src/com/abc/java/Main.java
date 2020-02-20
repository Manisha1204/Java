package com.abc.java;
import com.abc.data.Employee;
import com.abc.data.Project;
public class Main
{
	public static void main(String args[])
	{
	   Employee a1 = new Employee(03, "Manisha","IT");
	   Project p1=new Project(678, "C++");
	   Project p2=new Project(145, "Java");
	   Project p3=new Project(178, "Data Warehouse");
	   Project p4=new Project(234, "Web Technology");
	   
	   a1.addProjects(p1);
	   a1.addProjects(p2);
	   a1.addProjects(p3);
	   System.out.println("Number of projects added ");
	   a1.print();
	   
	   a1.removeProjects(p1);
	   a1.removeProjects(p3);
	   System.out.println("Number of projects removed ");
	   a1.print();
	}
}
