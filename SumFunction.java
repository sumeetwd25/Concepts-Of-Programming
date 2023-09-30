import java.util.Scanner;
public class SumFunction {

	public static void main(String[] args) {
	int num, total;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive number: ");
	num = sc.nextInt();
	total = natual(num);
	System.out.print("Sum of first "+num+" natural numbers is "+total);
	
	}
private static int natual(int num) {
	int i, sum=0;
	for (i=0; i<=num; i++) {
		sum = sum+i;
	}
	return sum;

}
}
