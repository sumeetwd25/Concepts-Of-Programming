
import java.util.Scanner;
public class ArrayAddinLine {
	static int arr1[][] = new int [3][3];
	static int arr2[][] = new int [3][3];

	
	public static void Addition() {
		
		System.out.println("\nAddition :");
		
		int arr3[][] = new int [3][3];
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
		arr3[i][j] = arr1[i][j]  + arr2[i][j];
			}
		}
		System.out.println(arr1[0][0]+"  " + arr1[0][1] + "  " + arr1[0][2] + "		"+arr2[0][0]+" "+arr2[0][1]+" "+arr2[0][2]+"		"+arr3[0][0]+" "+arr3[0][1]+" "+arr3[0][2]);
		System.out.println(arr1[1][0]+"  " + arr1[1][1] + "  " + arr1[1][2] + "	  +	"+arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]+"	=	"+arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
		System.out.println(arr1[2][0]+"  " + arr1[2][1] + "  " + arr1[2][2] + "		"+arr2[2][0]+" "+arr2[2][1]+" "+arr2[2][2]+"		"+arr3[2][0]+" "+arr3[2][1]+" "+arr3[2][2]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print("Enter a number for arr1["+i+"]["+j+"]: ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print("Enter a number for arr2["+i+"]["+j+"]: ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	
		Addition();
		
	}

}
