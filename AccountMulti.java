import java.util.Scanner;
public class AccountMulti {
	int id;
	String name;
	float balance;
	
	public AccountMulti() {}
	
	public AccountMulti(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String showData() {
		return "Account [id="+id+", name="+name+", balance="+balance+"]";
	}
	
	public void showDetails() {
		System.out.print("Account [id="+id+", name="+name+", balance="+balance+"]");
	}
	
	public static void createAccounts(AccountMulti a[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter account details for account "+(i+1));
			System.out.print("enter id ");
			int id = sc.nextInt();
			System.out.print("enter balance ");
			float f = sc.nextFloat();
			sc.nextLine();
			System.out.print("enter name ");
			String name = sc.nextLine();
			
			a[i] = new AccountMulti(id, name, f);
		}
	}
	
	public static void displayAccounts(AccountMulti a[]) {
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].showData());
		}
	}

	public static AccountMulti searchAccount(AccountMulti a[], int temp) {
		for(int i=0; i<=a.length; i++) {
			if(a[i].id == temp) {
				System.out.println(a[i].showData());
				return a[i];
			}
		}
		return null;
	}
	
	public static void updateAccountDetails(AccountMulti a[], int t, String name) {
		AccountMulti temp = searchAccount(a,t);
		if(temp != null) {
		temp.name = name;
		}
		System.out.println(temp.showData());
	}
	
	public static void main(String[] args) {
		
		AccountMulti a1 = new AccountMulti(101, "a", 5000.0f); 
		System.out.println(a1.showData());
		
		AccountMulti a[] = new AccountMulti[3];
		
		createAccounts(a);
		displayAccounts(a);
	}

}
