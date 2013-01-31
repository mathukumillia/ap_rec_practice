public class palindrome{
	public static void main(String[] args) {
		System.out.println(iterativePalindrome(args[0]));
		System.out.println(recursivePalindrome(args[0]));
	}
	public static boolean iterativePalindrome(String word){
		for(int i = 0; i < word.length(); i++){
			if(! (word.charAt(i) == word.charAt((word.length() - 1)-i)) ){
				return false;
			}
		}
		return true;
	}
	public static boolean recursivePalindrome(String word){
		
	}
}