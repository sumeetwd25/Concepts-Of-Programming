
public class SumForeach {
	


	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10}; 
		int sum=0;

		for(int i : num) {					//For each loop
			sum = sum + i;
		}
		System.out.print("Sum first 10 natural numbers is "+sum);

	}

}
