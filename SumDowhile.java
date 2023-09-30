import java.util.Scanner;
public class SumDowhile {

	public static void main(String[] args) {
	int num, i, sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter positive number: ");
	num = sc.nextInt();
	i = 0;
	do {
		sum = sum + i;
		i++;
	}while(i<=num);
	System.out.print("Sum of first "+num+" natural numbers is "+sum);
	}

}
