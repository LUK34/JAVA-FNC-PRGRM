package collections.HashMap;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	public Employee(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	

	
}

public class C40_HasMapUserDefinedObjects 
{
	public static void main(String[] args) 
	{
		
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(101, new Employee(101,"Chari","Zard","chari@gmail.com"));
		employeeMap.put(102, new Employee(102,"Vena","Saur","bena@gmail.com"));
		employeeMap.put(103, new Employee(103,"Blas","Toise","blas@gmail.com"));
		
		System.out.println(employeeMap);
	}

}
