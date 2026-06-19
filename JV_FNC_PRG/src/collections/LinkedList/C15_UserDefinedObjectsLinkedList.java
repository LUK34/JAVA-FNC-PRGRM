package collections.LinkedList;

import java.util.LinkedList;

class Student
{
	private int id;
	private String name;
	private String department;
	public Student(int id, String name, String department) 
	{
		
		this.id = id;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}

public class C15_UserDefinedObjectsLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Student> studentList = new LinkedList<>();
		studentList.add(new Student(1,"Ramesh","CS"));
		studentList.add(new Student(2,"Umesh","IT"));
		studentList.add(new Student(3,"Suresh","CS"));
		studentList.forEach((x) -> {System.out.println(x.toString());});
		
		
	}

}
