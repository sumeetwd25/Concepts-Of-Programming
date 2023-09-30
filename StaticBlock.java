
public class StaticBlock {

	int empId;
	static int count;
	
	static {						//static block
	count = 100;					//executes only once
	}
	
	{
	}
	
	public StaticBlock() {
		count = count + 1;
		empId = count;
		
	}
	
	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		System.out.println(s.empId);

		StaticBlock s1 = new StaticBlock();
		System.out.println(s1.empId);
		
		StaticBlock s2 = new StaticBlock();
		System.out.println(s2.empId);
		
		

	}

}
