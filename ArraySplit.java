/*
Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
INITIAL array :
58	24	13	15	63	9	8	81	1	78
*/
public class ArraySplit {

	public static void SplitArray(int arr[])
	{
		int a=(arr.length/2);   //5
	
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=a;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = new int[]{58,24,13,15,63,9,8,81,1,78};
		
	//System.out.println(arr.length);
		SplitArray(arr);
}
}
