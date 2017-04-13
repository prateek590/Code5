import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo1 {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}

	private static void doTimings(String type, List<Integer> list){
		
		
		long start = System.currentTimeMillis();

		for(int i=0;i<1e5;i++)
			list.add(0,i);
		for(int i=0;i<1e5;i++)
			list.add(i);
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for "+type+": "+(end-start));
		
	}
	
}
