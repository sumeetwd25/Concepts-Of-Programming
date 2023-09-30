import java.util.*;
public class CirclrArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final float pi = 3.14f;
		System.out.print("Enter the diameter: ");
		int d= sc.nextInt();
		float area = pi/4*d*d;
		System.out.println("Area of circle: "+area);
		
	}

}
