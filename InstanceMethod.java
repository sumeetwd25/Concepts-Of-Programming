
public class InstanceMethod {

	static int a = 10;
	int b = 20;					//instance variable
	
	void disp() {				//instance method
		System.out.println("The value of b = "+b);
	}
	
	public static void main(String[] args) {
		
		InstanceMethod i = new InstanceMethod();
		i.disp();				//instance method called
		
		System.out.println("The value of a = "+InstanceMethod.a);
	}

}
