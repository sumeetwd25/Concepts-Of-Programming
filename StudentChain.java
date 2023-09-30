
public class StudentChain {
	int i,j,k;
	String name;
	
	public StudentChain() {}								//default constructor
	
	public StudentChain(String name, int i, int j, int k) 	//4 parameter constructor
	{
		this(name, i, j);									
	}
	
	public StudentChain(String name, int i, int j) 			//3 parameter constructor
	{
	this.name = name;
	this.i = i;												//only i & j values are chained forward
	this.j = j;
	}
	
	public void doPercentage()
	{
	System.out.println("Name of student: "+name );
	int p = (i+j)/2;										
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
	
	public static void main(String[] args) {
		StudentChain a = new StudentChain("Ron", 60, 70, 80);
		a.doPercentage();
	}

}
