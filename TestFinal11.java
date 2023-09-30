import java.util.*;
public class TestFinal11 {
	int i;
	
	public TestFinal11(int i) {
		this.i = i;
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int temp = sc.nextInt();
		TestFinal11 tf;
		tf = new TestFinal11(temp);
		System.out.println("First time: "+tf.i);

		System.out.print("Enter a number: ");
		temp = sc.nextInt();
		tf = new TestFinal11(temp);
		System.out.println("Second time: "+tf.i);

	}
	
		
	}

