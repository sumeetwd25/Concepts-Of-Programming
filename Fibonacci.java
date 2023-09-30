import java.util.Scanner;

class Fibonacci
{

public static void main(String[] args)
{
int i,n;

int t1=0, t2=1;

int nextTerm = t1 + t2;

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of terms: ");
n = sc.nextInt();

System.out.print("Fibonacci series: "+t1+" "+t2);

for(i=3; i<=n; ++i)
{
System.out.print(" "+nextTerm);
t1 = t2;
t2 = nextTerm;
nextTerm = t1 + t2;
}
}
}
