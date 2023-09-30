import java.util.Scanner;
public class SumFor {

	public static void main(String[] args) {
	int num, i, sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter positive number: ");
	num = sc.nextInt();
	for(i=0; i<=num; i++)
	{
		sum = sum+i;
	}
	System.out.print("Sum of first "+num+" numbers is "+sum);
	}

}
