import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class App {

}

public class demo3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		System.out.println(new App());
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		
		map.put(1,"one");
		map.put(4,"four");
		map.put(3,"three");
		map.put(2,"two");
		map.put(5,"five");
		for(Integer key :map.keySet())
		{
			String value = map.get(key);
			System.out.println(key+" "+value);
		}
	}

}
