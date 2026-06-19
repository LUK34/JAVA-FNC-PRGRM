package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Employee(int id, String firstName, String lastName, String email)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}

public class C07_ArrayListUserDefinedObject 
{
	
	public static void main(String[] args) 
	{
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Luke","Rajan Mathew","luke@gmail.com"));
		emp.add(new Employee(2,"Henry","Cavill","henry@gmail.com"));
		emp.add(new Employee(3,"Chris","Evans","chris@gmail.com"));
		emp.forEach((e) -> {System.out.println("Employee Object Data:"+e.toString());});
		
	}

}
