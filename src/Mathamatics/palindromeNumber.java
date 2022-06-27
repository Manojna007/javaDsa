package Mathamatics;

public class palindromeNumber {
    public static boolean palin(int n){
        int rev=0;
        int num=n;
        while(num>0){
            int id =num%10;
            rev=rev*10+id;
            num/=10;

        }
        return n==rev;
    }
    public static void main(String[] args){
        int n=1221;
        System.out.println(palin(n));
    }
}
