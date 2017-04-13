import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1>l2)
			return 100;
		else if(l1<l2)
			return -1;
		else{
			
		return s1.compareTo(s2);
			
		}
			
	
	}
	
}

public class problem8 {

	public static void main(String[] args) {

	/*	
		TreeSet t = new TreeSet();
		t.add("And");
		t.add("Is");
		t.add("End");
		t.add("End");
		System.out.println(t);*/

		TreeSet t1 = new TreeSet(new myComparator());
		
		t1.add("And");
		t1.add("Is");
		t1.add("End");
		t1.add("End");
		System.out.println(t1);
		

		
	}

}
