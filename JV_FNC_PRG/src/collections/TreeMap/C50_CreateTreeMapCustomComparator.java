package collections.TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class C50_CreateTreeMapCustomComparator 
{
	public static void main(String[] args) 
	{
		SortedMap ttm= new TreeMap<>(Comparator.reverseOrder());
		
		ttm.put("python",".py");
		ttm.put("c++",".cpp");
		ttm.put("kotlin",".kt");
		ttm.put("golang",".go");
		ttm.put("java", ".java");
		
		System.out.println(ttm);
		
		
		
		
	}

}
