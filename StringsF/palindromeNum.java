class palindromeNum {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int rev = 0, remainder;

        while (num > 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("The number "+temp+" is a palindrome.");
        } else {
            System.out.println("The number "+temp+" is not a palindrome.");
        }
    }
}