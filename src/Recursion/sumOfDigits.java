package Recursion;

/*
2314-- (2314%10=4, 2314/10=231),....
recursive leap of faith (VVIMP)****:
if top if function is working for top layer, leave rest for recursive function

*/

public class sumOfDigits {
    static int sumOfDigit(int n){
        System.out.println(n);
        if(n==0) return 0;
        int lastDigit=n%10;
        return lastDigit+ sumOfDigit(n/10);
    }
    public  static void main(String[] args){
        int n=2414;
        System.out.println(("sum of digits is " +sumOfDigit(n)));
    }
}
