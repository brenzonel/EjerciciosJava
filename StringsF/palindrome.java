class palindrome {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as an argument.");
            return;
        }

        String inputString = args[0];
        if (isPalindrome(inputString)) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}