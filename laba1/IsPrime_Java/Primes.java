public class Primes {
    public static void main(String[] args) {
        System.out.println("1 prime");
        for (int i = 2; i < 100; ++i) {
            System.out.print(i + " "); 
            if (isPrime(i)) {
                System.out.println("prime");
            } else{
                System.out.println("");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}