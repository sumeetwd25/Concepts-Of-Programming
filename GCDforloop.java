import java.util.Scanner;

public class GCDforloop {

	public static void main(String[] args) {
	
	int n1, n2, i, GCD = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 2 numbers: ");
	
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
	for(i = 1; i <= n1 && i <=n2; ++i) {
		if (n1 % i == 0 && n2 % i == 0)
			GCD = i;
	}
	System.out.print("GCD of two numbers "+n1+" and "+n2+" is "+GCD);
	}

}
