package collections.TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class C51_CreateTreeMapCaseInSensitiveOrder 
{
	public static void main(String[] args) 
	{
		SortedMap ttm= new TreeMap<>();
		
		ttm.put("python",".py");
		ttm.put("Python",".py");
		ttm.put("c++",".cpp");
		ttm.put("kotlin",".kt");
		ttm.put("golang",".go");
		ttm.put("java", ".java");
		
		System.out.println(ttm);
		
		System.out.println("------------------------------------------------");
		
		SortedMap ttm1= new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		
		ttm1.put("python",".py");
		ttm1.put("Python",".py");
		ttm1.put("c++",".cpp");
		ttm1.put("kotlin",".kt");
		ttm1.put("golang",".go");
		ttm.put("java", ".java");
		
		System.out.println(ttm1);
		
	}

}
