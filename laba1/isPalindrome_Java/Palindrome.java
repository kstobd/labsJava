public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (!isPalindrome(s)){
                System.out.println("not all words are polyndromes");
                System.exit(0);
            }
        }
        System.out.println("all words are polydromes");
    }

    public static boolean isPalindrome(String s) {
        int word_len = s.length();
        for (int i = 0; i < (word_len / 2); ++i) {
            if (s.charAt(i) != s.charAt(word_len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}