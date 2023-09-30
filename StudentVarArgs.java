
class StudentVarArgs
{

public void display(String name, int...m){		//variable argument constructor
	
	System.out.println("Name of student: "+name );

		int sum = 0;
		
		for(int w : m) {				//enhanced for loops
			sum = sum + w;
		}
		
		int p = sum/m.length;
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
		StudentVarArgs a = new StudentVarArgs();

		a.display("Sam", 60,70,80);
		a.display("John", 60,70,80,90,100);

}
}