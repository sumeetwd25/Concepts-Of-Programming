
public class TestFinal {
	int i;
	final int j=45;
	final int k;
	
	public TestFinal(int k) {
	this.k = k;
	}
	
	public static void main(String[] args) {
		TestFinal tf = new TestFinal(7);
		System.out.println("j: "+tf.j);

	}

}
