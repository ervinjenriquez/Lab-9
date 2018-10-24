public class Recur {

	public static void main(String[] args) {

		print(6); 
		System.out.println(fibonacci(7));
		System.out.println(evenSum(6));
		System.out.println(evenSum(7));
	}
	
	//print Method
	public static void print(int n) {
		if (n != 0) {
			print(n - 1);
			printNum(n);
			System.out.println();
		}
	}
	
	//printNum Method
	public static void printNum(int n) {
		if (n != 0) {
			System.out.print(n + n + " ");
			printNum(n-1);
		}
	}
	
	//evenSum Method
	public static int evenSum(int n) {
		if (n%2 == 1) {
			n = n+1;
			
			if (n == 0) {
				return 0;
			} else {
				return (evenSum(n - 2) + n);
			} 
		} else {
			if (n == 0) {
				return 0;
			} else {
				return (evenSum(n - 2) + n);
			} 
		}

	}
	
	//Fib Method
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}else if (n <= 2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
