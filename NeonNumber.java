import java.util.*;
public class NeonNumber {

	
	public static void main(String[] args) {
		int num;
		int digit;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();	
		int x = num;

		while(num>0)
		{
			digit=num%10;
			sum = sum+digit;
			num=num/10;
		}
		if(sum==x) {
			System.out.println("It is a Neon number");
		}
		else {
			System.out.println("It is not a Neon number");
		}
	}			

}
