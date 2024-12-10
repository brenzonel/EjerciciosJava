class primeNot{
    public static void main(String[] args) {
         if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int i = 2;
        boolean prime = true;
        /* //otra forma de hacerlo
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        if (isPrime(n)) {
            System.out.println("The number " + n + " is prime.");
        } else {
            System.out.println("The number " + n + " is not prime.");
        }
        */
        while(i < n){
            if(n % i == 0){
                prime = false;
                break;
            }
            i++;
        }
        if(prime){
            System.out.println("El numero " + n + " es primo");
        }else{
            System.out.println("El numero " + n + " no es primo");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
