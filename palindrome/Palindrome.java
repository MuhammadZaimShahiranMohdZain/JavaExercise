package palindrome;

public class Palindrome {
    public boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    	char[] word = s.toCharArray();
    	String reverse = "";
    	for (int i = 0; i < word.length; i++) {
    		reverse=reverse + "" + word[word.length-i-1];
		}
    	return reverse.equals(s);
    }
}
