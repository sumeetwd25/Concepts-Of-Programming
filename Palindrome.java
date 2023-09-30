import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int n, reversed = 0, remainder, original;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		n = s.nextInt();
		original = n;
		
		while(n!=0)
		{
			remainder = n%10;
			reversed = reversed*10+remainder;
			n/=10;
		}
		if (original==reversed)
			System.out.println(original+" is a palindrome");
		else
			System.out.println(original+" is not a palindrome");
	}

}
