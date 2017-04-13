import java.util.HashSet;
import java.util.Set;

public class demo4 {

	public static void main(String[] args) {

		Set<String> set = new HashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");

		Set<String> set2 = new HashSet();
		set2.add("3");
		set2.add("2");
		set2.add("7");
		set2.add("8");
		set2.add("9");
		
		Set<String> intersection = new HashSet<>(set);
		
		System.out.println(intersection);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		intersection = new HashSet<>(set);
		intersection.removeAll(set2);
		System.out.println(intersection);
	}

}
