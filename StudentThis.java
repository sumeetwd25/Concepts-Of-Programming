
class StudentThis
{
int i,j,k;							//instance variables
String name;

public StudentThis() {}				//default constructor

public StudentThis(String name, int i, int j, int k) 
{
	this.name = name;				//local variables
	this.i = i;
	this.j = j;
	this.k = k;
}

public void doPercentage()
{
System.out.println("Name of Student: "+name );
int p = (i+j+k)/3;
System.out.println("Percentage: "+p);

if(p >= 90)
    {
        System.out.println("Grade A\n");
    }
    else if(p >= 80)
    {
        System.out.println("Grade B\n");
    }
    else if(p >= 70)
    {
        System.out.println("Grade C\n");
    }
    else if(p >= 60)
    {
        System.out.println("Grade D\n");
    }
    else if(p >= 40)
    {
        System.out.println("Grade E\n");
    }
    else
    {
        System.out.println("Grade F\n");
    }


}

public static void main(String[] args)
{
StudentThis a = new StudentThis();
a.doPercentage();

StudentThis a1 = new StudentThis("James",40,50,60);
a1.doPercentage();
}
}
