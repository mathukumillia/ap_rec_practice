/**************************************************************
 * 
 * 	fibonacci
 * 
 * 		Computes the first n fibonacci numbers
 * 
 **************************************************************/

public class fibonacci {
	
	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the number of fibonacci numbers to find
	 */
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Please type a number after fibonacci the next time you run this program.");
			System.exit(0);
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println(args[0] + " is not a number.");
			System.exit(0);
		}
		if (n < 1) {
			System.out.println("The number must be greater than 0.");
			System.exit(0);
		}

		//System.out.println("The " + n + "th number of the fibonacci sequence is " + iterativeFibonacci(Integer.parseInt(args[0])));
		
		
		
		System.out.println("The " + n + "th number of the fibonacci sequence is " + recursiveFibonacci(Integer.parseInt(args[0])));
	}


	/**
	 * iterativeFibonacci
	 * 		iteratively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int iterativeFibonacci(int n) {
		int present = 1;
		int oneback = 1;
		int answer = 0;
		if(n == 1){
			return oneback;
		}
		if(n == 2){
			return 1;
		}
		if(n == 3){
			return 2;
		}	
		for(int i = 0; i < n-2; i++){
			answer = present + oneback;
			oneback = present;
			present = answer;			
		}
		return present;
	}

	/**
	 * recursiveFibonacci
	 * 		recursively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static int recursiveFibonacci(int n) {
		if(n == 1 || n == 2){
			return 1;
		}

		return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);

	}

}