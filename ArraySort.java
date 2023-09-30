import java.util.*;



public class ArraySort {
	static int arr[]= new int[]{11,34,77,56,65,55,13,22,19,88};

	
	public static void sortAscDsc() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Ascending\nEnter 2 for Descending");
		i = sc.nextInt();
		if(i==1) {
			sortAscending(arr);
		}
		else if(i==2) {
			sortDescending(arr);
		}
		else {
			System.out.println("Enter valid number");
		}
	}
	
	public static void insertElement(int arr[] , int pos,int data)
	{
		for (int i=0;i<arr.length;i++)
		{
			arr[pos]=data;
		}
	}
	public static void displayArray(int arr[] )
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void deleteElement(int arr[],int pos)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i==pos) 
			{
				arr[i]=0;	
	
			for(int j=pos;j<arr.length-1;j++) 
			{
				arr[j]=arr[j+1];                    
			}
			arr[arr.length-1]=0;
			}
		}
	}

	public static void sortAscending(int a[])
	{
		for(int i  = 0 ; i < a.length ; i++) {			
			int tmp = 0 ;			
			for (int  j = i+1 ; j<a.length ; j++) {
				if(a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					
				}				
			}
		}
	}
			
	public static void sortDescending(int a[])
			{
				for(int i =0 ;i<a.length;i++)
				{
					int temp=0;
					for(int j = i+1;j<a.length;j++)
					{
						if(a[i]<a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
				}
			}
		
		}
	
	public static void main(String[] args) {
//		insertElement(arr,3,555);           
//		deleteElement(arr,6);
//		sortAscending(arr);
//		sortDescending(arr);
		sortAscDsc();
		displayArray(arr);
	}

}