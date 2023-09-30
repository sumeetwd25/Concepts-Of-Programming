import java.util.Scanner;

public class Account {
	int accId;
	static String accType;
	static String name;
	static float balance;
	int iRate = 12;
	
	static Scanner sc = new Scanner(System.in);

	
	public void createAcc() {
		System.out.println("Create new account:");
		System.out.print("Enter account Id: ");
		accId = sc.nextInt();
		System.out.print("Enter account type(Current/Savings): ");
		accType = sc.next();
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter balance: ");
		balance = sc.nextInt();
		System.out.println("Account created.");
	}
	
	public void showAcc() {
		System.out.println("Information of account:");
		System.out.println("Name of account holder: "+name);
		System.out.println("Account Id: "+accId);
		System.out.println("Account type: "+accType);
		System.out.println("Balance: "+balance);
	}

	public void deposit() {
		int amt;
		System.out.print("Enter the amount: ");
		amt = sc.nextInt();
		balance = balance + amt;
		System.out.println("Transaction successful.");
		System.out.println("Balance: "+balance);


	}
	
	public void withdrawal() {
		int amt;
		System.out.print("Enter the amount: ");
		amt = sc.nextInt();
		if(balance>amt) {
			balance = balance - amt;
			System.out.println("Transaction successful.");
			System.out.println("Balance: "+balance);
			
		}
		else {
			System.out.println("Your balance is less than "+amt+"\nTransaction failed.");

		}
	}
	
	public void changeROI() {
		System.out.println("Enter new interest rate: ");
		iRate = sc.nextInt();
		System.out.println("New interest rate: "+iRate+"%");

	}
	
	public void calcROI() {
		double p,n=1,a,r=(iRate/12.0);
		System.out.print("Enter principle amount: ");
		p=sc.nextDouble();
		
		a = p*((Math.pow(1+r/100.0, n)));
		System.out.println("Interest rate: "+iRate+"%");

		System.out.println("Final amount after 30 days: "+a);
		
	}
	
	public boolean search (int accNo) {
		if(accId == accNo) {
			
			return(true);
		}
		return (false);
	}
	
	public static void main(String[] args) {
		int accNo;
		boolean found;
		char num;
		Account a = new Account();

		System.out.println("Display Menu:");
		System.out.println("1. Create Account");
		System.out.println("2. Display information of account");
		System.out.println("3. Deposit");
		System.out.println("4. Withdrawal");
		System.out.println("5. Check Balance");
		System.out.println("6. Change interest rate");
		System.out.println("7. Calculate interest rate for 30 days");
		System.out.println("8. Exit");
		
		do {

			System.out.print("\nPlease enter your choice: ");
			num = sc.next().charAt(0);

		switch(num) {
		case'1':
			a = new Account();
			a.createAcc();		
			break;
			
		case'2':
			System.out.print("Enter account Id: ");
			 accNo = sc.nextInt();
			 found = false;
			found = a.search(accNo);
			if(found) {
				a.showAcc();
				break;
			}
			if(!found) {
				System.out.println("Search failed. Account does not exist.");
				break;
			}
			
			
			break;
			
		case'3':
			System.out.print("Enter account Id: ");
			 accNo = sc.nextInt();
			 found = false;
			found = a.search(accNo);
			if(found) {
				a.deposit();
				break;
			}
			if(!found) {
				System.out.println("Search failed. Account does not exist.");
				break;
			}
			break;
			
		case'4':
			System.out.print("Enter account number: ");
			 accNo = sc.nextInt();
			 found = false;
			found = a.search(accNo);
			if(found) {
				a.withdrawal();
				break;
			}
			if(!found) {
				System.out.println("Search failed. Account does not exist.");
				break;
			}
			break;
		
		case'5':
			System.out.println("Balance: "+balance);
			break;
		
		case'6':
			a.changeROI();
			break;
		
		case'7':
			a.calcROI();
			break;
		
		case'8':
			System.out.println("Thankyou");
			break;
		
		default:
			System.out.println("Please enter valid number.");
		}
		}while(num != '8');
		
	}

}
