
public class problem10 {

	
	public void shuffle(){
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		
		
		problem10 object2 = (problem10) Class.forName("problem10").newInstance();
		
		problem10 object3 = (problem10) object2.clone();
		
		Object obj4 = problem10.class.getClassLoader().loadClass("problem10").newInstance();
		
		problem10 object4 = (problem10)obj4;
		
	
		
	}

}
