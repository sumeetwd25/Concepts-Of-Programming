public class InstanceBlock {

	int empId;
	static int count;
	

	
	{count = 100;					//instance block
	}								//executes per instance
	
	public InstanceBlock() {
		count = count + 1;
		empId = count;
		
	}
	
	public static void main(String[] args) {
		InstanceBlock s = new InstanceBlock();
		System.out.println(s.empId);

		InstanceBlock s1 = new InstanceBlock();
		System.out.println(s1.empId);
		
		InstanceBlock s2 = new InstanceBlock();
		System.out.println(s2.empId);
		
		

	}

}