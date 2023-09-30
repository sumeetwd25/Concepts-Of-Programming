import java.util.Scanner;
public class ArrayAdd {
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
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();

			}
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
