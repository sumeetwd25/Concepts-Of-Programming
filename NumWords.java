import java.util.Scanner;

public class NumWords {

	public static void main(String[] args) {
	
		int num, rev=0, digit, rem;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		System.out.print("In words: ");
		
	while(num>0) {
		rem = num % 10;
		rev = rev * 10 + rem;
		num = num / 10;
		
	}
	while(rev>0) {
		digit = rev % 10;
		switch(digit) {
		case 1: System.out.print("One ");
		break;
		case 2: System.out.print("Two ");
		break;
		case 3: System.out.print("Three ");
		break;
		case 4: System.out.print("Four ");
		break;
		case 5: System.out.print("Five ");
		break;
		case 6: System.out.print("Six ");
		break;
		case 7: System.out.print("Seven ");
		break;
		case 8: System.out.print("Eight ");
		break;
		case 9: System.out.print("Nine ");
		break;
		case 0: System.out.print("Zero ");
		break;
		default: System.out.print("Error");
		break;
		}
		rev = rev/10;
	}
	}

}
