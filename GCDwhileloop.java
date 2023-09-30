
public class GCDwhileloop {

	public static void main(String[] args) {
	
	int n1 = 30, n2 = 100;
	while(n1 != n2) {
		if(n1>n2) {
			n1 = n1 - n2;
		}
		else {
			n2 = n2 - n1;
		}
	}
	
	System.out.print("GCD of two numbers 30 and 100 is "+n2);
	}

}
