import java.util.HashMap;
import java.util.Map;

public class demo2 {

	public static void main(String[] args) {

		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(map.get(2));
		
		for(Map.Entry<Integer, String> set : map.entrySet()){
		int key = set.getKey();
		String value = set.getValue();
			System.out.println(key+" "+value);
	}
	}
}
