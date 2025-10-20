public class Palindrome {
    public static boolean is_Palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palstr = "noo";
        System.out.println(is_Palindrome(palstr));
    }
}
// This code checks if a string is a palindrome by comparing characters from the
// start and end towards the center.
// If any characters do not match, it returns false, indicating the string is
// not a palindrome