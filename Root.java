import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter a number: ");
			
			int n = sc.nextInt();
			
			System.out.println("The square root of "+n+" is: "+sqRoot(n));
		
	}
		
		public static double sqRoot(int num)
		{
			double t;
			double rt=num/2;
			do {
				t = rt;
				rt = (t+(num/t))/2;
			}
			while((t-rt)!=0);
			return rt;
		
}

	
}
