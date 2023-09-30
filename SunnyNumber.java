import java.util.*;
class SunnyNumber{
 
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Result(n);
	}
	
	static boolean SquareRoot(double r) {
		
		
		double x = Math.sqrt(r);
		return ((x-Math.floor(x)) == 0);	
	}
		
		static void Result(int n) {
			if(SquareRoot(n+1))
			{
				System.out.println("It is a Sunny number");
			}
			else {
				System.out.println("It is not a Sunny number");

		}
		
	}
}
