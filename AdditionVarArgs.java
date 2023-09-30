
public class AdditionVarArgs {

	int s;
	
	public void add(int...i) {
		int sum = 0;
		for(int w : i) {				//enhanced for loops
			sum = sum + w;
		}
		
		System.out.println("Addition of "+i.length+" numbers is "+sum);
	}	
	
	public static void main(String[] args) {
		AdditionVarArgs a = new AdditionVarArgs();
		a.add();
		a.add(1,2);
		a.add(1,2,3,4,5);
		a.add(1,2,3,4,5,6,7);
		
	
			
	}

}
