import java.util.Scanner;
class Addition
{
int i,j;
 
 public void acceptData()
 {
 Scanner s = new Scanner(System.in);
 System.out.print("Enter 1st number: ");
 i = s.nextInt();
 System.out.print("Enter 2nd number: ");
 j = s.nextInt();
 }
 
 public void doAddition()
 {
 int c = i+j;
 System.out.println("\nIn doAddition method");
 System.out.println("Addition is "+c);
 System.out.println("Addition is "+(i+j));
 }
 
 public static void main(String[] args)
 {
 System.out.println("\nIn main method");
 Addition a = new Addition();
 a.acceptData();
 a.doAddition();
 }
 }