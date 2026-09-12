package collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Todo
{
	private int id;
	private String name;
	private String description;
	
	public Todo(int id, String name, String description)
	{
		this.id=id;
		this.name=name;
		this.description=description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, Integer.valueOf(id), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class C47_CreateLinkedHashMapUserDefinedObjs 
{
	public static void main(String[] args) 
	{
		Map<Integer, Todo> todoMap = new LinkedHashMap<>();
		todoMap.put(1, new Todo(1,"Learn Java Programming","Learn Java programming with examples"));
		todoMap.put(2, new Todo(1,"Learn Spring Programming","Learn Spring programming with examples"));
		todoMap.put(3, new Todo(1,"Learn SpringBoot Programming","Learn SpringBoot programming with examples"));
		System.out.println(todoMap);
		
	}

}
