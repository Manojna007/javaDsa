package Mathamatics;
// theta(rooot(n))
public class allDivisors {
    public static void printDivisors(int n) {
        int i = 1;

        for (; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                // System.out.println((n / i));
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
               if(n/i!=i) System.out.println(n / i);


            }
        }
    }

    public static void main(String[] args){
        printDivisors(45);
    }
}
