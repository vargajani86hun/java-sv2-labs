package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String word = "Aibohphobia";
        PalindromeValidator pv = new PalindromeValidator();
        System.out.println(word + " is " + (pv.isPalindrome(word)? "" : "not ") + "a palindrome");
        word = "palindrome";
        System.out.println(word + " is " + (pv.isPalindrome(word)? "" : "not ") + "a palindrome");
        word = "madam";
        System.out.println(word + " is " + (pv.isPalindrome(word)? "" : "not ") + "a palindrome");
    }
}
