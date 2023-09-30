import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
int num,i,count=0;
Scanner s = new Scanner(System.in);

System.out.print("Enter a number: ");
num = s.nextInt();

for(i=2; i<num; i++)
{
	if(num%i == 0)
	{
		count++;
		break;
	}
}

if(count==0)
		System.out.println("\nIt is a prime number.");
else
		System.out.println("\nIt is not is a prime number.");
}
}