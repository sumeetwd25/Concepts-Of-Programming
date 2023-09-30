
public class EvenNestedif {

	public static void main(String[] args) {
	System.out.print("List of even numbers between 1 and 11: ");
	
	display(1,11);
	}

	private static void display(int i, int j) {
if(i > j)
	return;
if(i % 2 == 0) {
	System.out.print(i+" ");
	display(i+2, j);
}
else {
	display(i+1, j);
}
	}

}
