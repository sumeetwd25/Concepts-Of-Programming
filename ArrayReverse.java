import java.util.Scanner;
//take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.

public class ArrayReverse {
	
	public static  void acceptArray(int arr[])
	{
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++)
		{
			Scanner sc =new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
	}
	public static  void DisplayArray(int arr[])
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");		
		}
	}
	public static  void CopyArray(int arr[],int arr2[])
	{
		for(int i=9;i>=0;i--)  
		{                               
			
				arr2[9-i]=arr[i];

		}
	}
	

	public static void main(String[] args) {
		int arr[]=new int[10];          //1 2 3 4 5
		int arr2[]=new int[10];        //5 4 3 2 1
		
		acceptArray(arr);
		DisplayArray(arr);
		CopyArray(arr,arr2);
		DisplayArray(arr2);
	}

}
