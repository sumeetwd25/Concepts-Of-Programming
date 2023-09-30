
public class StaticMethod {
	
	static int a = 40;					//static variables
	static int b = 50;
	
	static void disp() {				//static method			
		System.out.println("the value of a = "+a);
	}
	
	public static void main(String[] args) {
		
		StaticMethod.disp();			//static method called
		System.out.println("The value of b = "+b);
		
	}

}
