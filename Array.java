import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[][];				//declaration
		
		s = new int [2][2];		//size
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s.length; j++) {
				System.out.print("Enter a data for ["+i+"]["+j+"]		");
				s[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s.length; j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
