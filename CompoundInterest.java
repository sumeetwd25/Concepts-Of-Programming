import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		
		double p,n,r,a,CI;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter principle amount: ");
		p=s.nextDouble();
		System.out.print("Enter number of years: ");
		n=s.nextDouble();
		System.out.print("Enter rate of interest: ");
		r=s.nextDouble();
		
		a = p*((Math.pow(1+r/100.0, n)));
		
		CI = a - p;
		
		System.out.println("Coumpound interest: "+CI);
		System.out.println("Final amount: "+a);

		
		
	}

}
