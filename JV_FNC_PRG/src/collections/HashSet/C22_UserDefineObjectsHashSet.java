package collections.HashSet;

import java.util.HashSet;
import java.util.Objects;

class Student
{
	private int rollNumber;
	private String name;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	public Student(int rollNumber, String name) 
	{
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	
	
	
}


public class C22_UserDefineObjectsHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<Student> s = new HashSet<>();
		s.add(new Student(101,"Ramesh Fadatare"));
		s.add(new Student(102,"Priya Sharma"));
		s.add(new Student(103,"Rajesh Kumar"));
		
		s.forEach( (st) -> {System.out.println(st.toString());});
		
		
	}

}
