import java.util.Scanner;

class Student
{
int i,j,k;
String name;

public void acceptData()
{
Scanner s = new Scanner(System.in);
System.out.print("Enter student name: ");
String name = s.nextLine();
System.out.print("Enter subject 1 marks: ");
i = s.nextInt();
System.out.print("Enter subject 2 marks: ");
j = s.nextInt();
System.out.print("Enter subject 3 marks: ");
k = s.nextInt();

}

public void doPercentage()
{
System.out.println("Name of student: "+name);
int p = (i+j+k)/3;
System.out.println("Percentage: "+p);

if(p >= 90)
    {
        System.out.println("Grade A");
    }
    else if(p >= 80)
    {
        System.out.println("Grade B");
    }
    else if(p >= 70)
    {
        System.out.println("Grade C");
    }
    else if(p >= 60)
    {
        System.out.println("Grade D");
    }
    else if(p >= 40)
    {
        System.out.println("Grade E");
    }
    else
    {
        System.out.println("Grade F");
    }


}

public static void main(String[] args)
{
Student a = new Student();
a.acceptData();
a.doPercentage();
}
}