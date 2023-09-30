import java.util.Scanner;

class Even
{

public static void main(String[] args)
{
int f1,f2,rem,i;

Scanner s = new Scanner(System.in);

System.out.print("Enter first number for the range: ");
f1 = s.nextInt();
System.out.print("Enter last number for the range: ");
f2 = s.nextInt();


System.out.println("\nThe even numbers between "+f1+" and "+f2+" are: ");
for(i=f1; i<=f2; ++i)
{
rem = i%2;
	if(rem==0)
	System.out.print(" "+i);
}
}
}