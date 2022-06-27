package Mathamatics;
// euclid algorithm:gcd(a,b)= gcd(a-b,b) where a>b;

public class gcd {
    static int Gcd(int a,int b){
        System.out.println(a+" "+b);
        if(a==b) return a;
        if(a<b) return Gcd(b,a);
        return Gcd(a-b,b);

    }
    static int modifiedGcd(int a,int b){
        System.out.println(a+" "+b);
        if(a<b) return Gcd(b,a);
        //if(b==0) return a;
        if(a%b==0) return b;
        return Gcd(a%b,b);
    }
    public static void main(String[] args){
        int a=60;
        int b=24;
        System.out.println("solution is: "+Gcd(a,b));
        System.out.println("solution is: "+modifiedGcd(a,b));
    }


}
