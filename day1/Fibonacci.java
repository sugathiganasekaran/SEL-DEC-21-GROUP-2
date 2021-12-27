package week1.day1;

public class Fibonacci {
	
	

	public static void main(String[] args) {
		int n=8;
		int N1 = 0;
		int N2 = 1;
		int sum;
		
			System.out.println("first num");{
			for (int i=1 ; i<=n; i++)
			{
       sum = N1 + N2;
       System.out.println(sum);
		N1 = N2;
		N2 = sum;
		//System.out.println(sum);
			}

	}

}
}