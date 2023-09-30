import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,r,sum=0,temp;
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	n = sc.nextInt();
	temp = n;
		
		while(n>0)
		{
			r=n%10;
			sum = sum + (r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.print("It is an armstrong number");
		else
			System.out.print("It is not an armstrong number");
	}	
	}


