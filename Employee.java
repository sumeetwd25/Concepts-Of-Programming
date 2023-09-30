import java.util.Scanner;

public class Employee {					
	int empId;
	float basicSal;
	String firstName , lastName;
	
	public Employee(){							//parameterless constructor
	}
	
	public Employee(int i, float s, String f, String l){			//parameterized constructor
		empId = i;						
		basicSal = s;
		firstName = f;
		lastName = l;


	}
	
	void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		empId = sc.nextInt();
		System.out.print("Enter Employee's basic salary: ");
		basicSal = sc.nextInt();
		System.out.print("Enter employee's first name: ");
		firstName = sc.next();
		System.out.print("Enter employee's last name: ");
		lastName = sc.next();
	}
	
	
	void showData() {
		System.out.println("Employee id: "+empId);
		System.out.println("Employee salary: "+basicSal);
		System.out.println("First name: "+firstName);
		System.out.println("last name: "+lastName+"\n");

	}
	
	

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(1234,100000.0f,"John","Wick");
		Employee e3 = new Employee();

		e1.showData();						
		
		e2.showData();

		e3.acceptData();
		e3.showData();
	}

}
