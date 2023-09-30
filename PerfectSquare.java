import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	
	double num = sc.nextDouble();
	if(check(num))
		System.out.println("The number is perfect square.");
	else
		System.out.println("The number not is perfect square.");
		
	}

	static boolean check(double num) {
		for(int i = 1; i*i <= num; i++) {
			if((num % i == 0) && (num / i == i)) {
				return true;
			}
		}
		return false;
	}

	

}
