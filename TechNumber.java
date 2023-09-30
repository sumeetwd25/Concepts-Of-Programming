import java.util.Scanner;
public class TechNumber1 {

	public static void main(String[] args) {
		int i, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		i=sc.nextInt();
		int num=i; 
		int first = 0;
		int last = 0;
		int digit=0;
		
		while(num>0)
		{
			digit++;  
			num=num/10; 
	
	
		if(digit%2 == 0)
		{
			
			{
				first= i/100;
				last = i%100;
			}
			
			result=first+last;
			
			if((result*result)==i)
				
			{
				System.out.println("It is a Tech number");
			}
			else {
				System.out.println("It is not a Tech number");
			}
		}
		

	}

}
}