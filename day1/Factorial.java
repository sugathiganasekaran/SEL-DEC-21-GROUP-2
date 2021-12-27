package week1.day3;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
	    int factorial = 1;
	    
		for(int i=1; i<=n; i++) {
			System.out.println(factorial);
		
		factorial = factorial*n;
		}
		System.out.println(factorial);

	}

}
