

class exp{
	StringBuilder a;
	public exp(StringBuilder a){
		a.append("hi");
		System.out.println("exp's String is: "+a);
	}
	
	
}

public class demo16 {

	public static void main(String[] args) {
		StringBuilder c = new StringBuilder("Hello");
		exp e = new exp(c);
		System.out.println("demo16's String is: "+c);
		
		
	}

}
