import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		int l,b,a;
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter length of rectangle: ");
		l = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		b = sc.nextInt();
		
		a = l*b;
		System.out.println("Area of rectangle: "+a);
	}

}
