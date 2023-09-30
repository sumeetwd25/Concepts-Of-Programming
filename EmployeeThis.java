
public class EmployeeThis {
	
	int empId;							//instance variables
	float basicSal;
	String firstName , lastName;
	
	public EmployeeThis() {}			//default constructor
	
	public EmployeeThis(int empId, float basicSal, String firstName, String lastName) {
		this.empId = empId;				//local variables
		this.basicSal = basicSal;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void showData() {
		System.out.println("Employee id: "+empId);
		System.out.println("Employee salary: "+basicSal);
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName+"\n");

	}

	public static void main(String[] args) {

		EmployeeThis e = new EmployeeThis();
		e.showData();
		
		EmployeeThis e1 = new EmployeeThis(12345, 50000.0f, "Jack", "Sparrow");
		e1.showData();
		
	}

}
