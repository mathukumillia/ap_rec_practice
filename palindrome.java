/**
 * 		palindrome 
 *   		checks if a given word is a palindrome and returns true or false
 *   		this class does this in both a recursive and iterative fashion
 */

public class palindrome{
	public static void main(String[] args) {
		System.out.println(iterativePalindrome(args[0]));
		System.out.println(recursivePalindrome(args[0]));
	}

	/**
	 *	iterativePalindrome
	 *		check if a word is a palindrome iteratively
	 *	pre: the string being passed in must not be null
	 * 	post: the method returns a boolean
	 * 
	 * 	@param word - the word that needs to be checked if its a palindrome
	 * 	@return - true or false depending on if the word is a palindrome
	 * 
	 */
	public static boolean iterativePalindrome(String word){
		for(int i = 0; i < word.length(); i++){
			if(! (word.charAt(i) == word.charAt((word.length() - 1)-i)) ){
				return false;
			}
		}
		return true;
	}


	public static boolean recursivePalindrome(String word){
		if(word.charAt(0) == word.charAt(word.length() - 1)){
			if(word.length() == 1 || word.length() == 0){
				return true;
			}
			return recursivePalindrome(word.substring(1,word.length() -1));
		}
		return false;
	}
}