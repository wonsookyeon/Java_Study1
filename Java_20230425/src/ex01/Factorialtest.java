package ex01;



public class Factorialtest {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
                               // 120
	}

	
	
	static int factorial(int n) {     
		int result = 0;
		
		if(n==1)
			return 1;
		else result = n*factorial(n-1);    
		
		return result;
	}
	
}
