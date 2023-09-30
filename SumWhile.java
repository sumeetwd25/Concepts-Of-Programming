import java.util.Scanner;
public class SumWhile {

	public static void main(String[] args) {
	int num, i, sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive number: ");
	num = sc.nextInt();
	i = 0;
	while(i<=num) {
		sum = sum + i;
		i++;
	}
	System.out.println("Sum of first "+num+" natural numbers is "+sum);
	
	}

}
