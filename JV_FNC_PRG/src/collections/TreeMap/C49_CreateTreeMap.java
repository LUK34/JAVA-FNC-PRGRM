package collections.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class C49_CreateTreeMap 
{
	public static void main(String[] args) 
	{
		SortedMap ttm= new TreeMap<>();
		
		ttm.put("python",".py");
		ttm.put("c++",".cpp");
		ttm.put("kotlin",".kt");
		ttm.put("golang",".go");
		ttm.put("java", ".java");
		
		System.out.println(ttm);
		
		
		
		
	}

}
