import java.util.Comparator;
import java.util.TreeSet;



class Employee implements Comparable{
	int id;
	String name;
	
public Employee(int id, String name){
	
	this.id=id;
	this.name=name;
	
}
	public int compareTo(Object obj1){
		int e1id = this.id;
		Employee e2 = (Employee)obj1;
		int e2id = e2.id;
		if(e2id>e1id)
			return -1;
		else if(e2id<e1id)
		return 1;
		else
			return 0;
	}

public String toString(){
	return "name "+name+", "+"id "+id+"; ";
	
}
	
}

public class problem9 {

	
	
	public static void main(String[] args) {

	TreeSet t = new TreeSet();
	t.add(new Employee(123,"steve"));
	t.add(new Employee(124,"and"));
	t.add(new Employee(125,"end"));
		
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new myComparator1());
		t1.add(new Employee(123,"steve"));
		t1.add(new Employee(124,"and"));
		t1.add(new Employee(125,"end"));
			
			System.out.println(t1);
	}

}
class myComparator1 implements Comparator{



	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}
