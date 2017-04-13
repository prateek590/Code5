import java.util.ArrayList;

public class problem3 {
	static int[] arr = new int[1];
	static int pointer = 0;
	
	
	public static void main(String[] args) {

		
		problem3 arrayList = new problem3();
		
		
		System.out.println(arrayList.size());
		
		arrayList.add(23);
		System.out.println(arrayList.size());
		
		arrayList.add(25);
		arrayList.add(28);
		
		System.out.println(arrayList.size());
		
		arrayList.remove();
		System.out.println(arrayList.size());
		arrayList.remove();
		arrayList.remove();
		System.out.println(arrayList.size());
		arrayList.remove();
		System.out.println(arrayList.size());
		
		//System.out.println(arrayList.size());
		
	/*	ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		Long a = System.currentTimeMillis();
		for (int i=0;i<1e5;i++){
			arrList.add(i);
		}
		Long b = System.currentTimeMillis();
		System.out.println("Time taken to add elements using arrList: "+(b-a));
	
		Long a1 = System.currentTimeMillis();
		for (int i=0;i<1e5;i++){
			arrayList.add(i);
		}
		Long b1 = System.currentTimeMillis();
		System.out.println("Time taken to add elements using arrayList: "+(b1-a1));
	
		
		System.out.println(arrList.size());
		System.out.println(arrayList.size());*/
	}
	
	public void add(int a){
		int[] arr2 = arr;
		arr = new int[arr.length+1];
		for(int i=0;i<arr2.length;i++)
			arr[i]=arr2[i];
		arr[++pointer]=a;
		for(int i=1;i<=pointer;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public void remove(){
		if(pointer>0){
		int[] arr2 = arr;
		arr = new int[arr.length-1];
		for(int i=0;i<arr2.length-1;i++)
			arr[i]=arr2[i];
		--pointer;
		for(int i=1;i<=pointer;i++)
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		else
			System.out.println("List is empty!!!");
	}
	
	public int size(){
		return pointer;
	}

}
