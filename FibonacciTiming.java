package cen3024c;

public class FibonacciTiming {
	
	static int fibRecursive(int n) { //initializing input for int n
			if (n == 0) return 0;
			if (n == 1) return 1;

			return fibRecursive(n-1) + fibRecursive(n-2);
		}
		
	static int fibIterative(int n) { //initializing input for int n
		int v1 = 0, v2 = 1, v3 = 0; 
		for (int i = 2; i <= n; i++); {
		v3 = v1 + v2;
		v1 = v2;
		v2 = v3;
		}
		return v3;
		}
		
	public static void main(String[] args) {
		
		System.out.print("x-axis\tRecursive\tIterative\n");
		System.out.println("------\t---------\t---------");
		int n = 40; // for loop input as n 
		for (int i = 20; i <= n; ++i) { // incremental for loop to start at 20, all the way to 40
		long startTime = System.nanoTime(); //setting long startTime to nano seconds
		
		fibRecursive(i); //passing the input i from the incremental for loop through the fib recursive method
		System.out.print(i + "\t" + (System.nanoTime() - startTime) +"  ");
		
		fibIterative(i); //passing the input i from the incremental for loop through the fib recursive method
		System.out.print("\t" + (System.nanoTime() - startTime) + "\n");
	}
	}
	}
	
	


