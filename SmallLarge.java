import java.util.Scanner;

public class SmallLarge {

	public static void main(String[] args) {
	
	int min, max, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter 10 numbers: ");
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	n3 = sc.nextInt();
	n4 = sc.nextInt();
	n5 = sc.nextInt();
	n6 = sc.nextInt();
	n7 = sc.nextInt();
	n8 = sc.nextInt();
	n9 = sc.nextInt();
	n10 = sc.nextInt();
	
	min = n1;
	max = n2;
	
	if(min>n2)
		min = n2;
	else if(max<n2)
		max = n2;
	
	if (min>n3)
		min = n3;
	else if(max<n3)
		max = n3;
	
	if (min>n4)
		min = n4;
	else if(max<n4)
		max = n4;
	
	if (min>n5)
		min = n5;
	else if(max<n5)
		max = n5;
	
	if (min>n6)
		min = n6;
	else if(max<n6)
		max = n6;
	
	if (min>n7)
		min = n7;
	else if(max<n7)
		max = n7;
	
	if (min>n8)
		min = n8;
	else if(max<n8)
		max = n8;
	
	if (min>n9)
		min = n9;
	else if(max<n9)
		max = n9;
	
	if (min>n10)
		min = n10;
	else if(max<n10)
		max = n10;
	
	System.out.println("Largest number: "+max);
	
	System.out.println("Smallest number: "+min);

	}

}
