package Mathamatics;
// a^b= a^(b/2)*a^(b/2) if b is even
// a^b= a^(b/2)*a^(b/2)*a if b is odd
// TC- O(logn)
public class fastPower {
    static int Power(int a,int b){
        if(b==0) return 1;
        int halfRes=Power(a,b/2);
        int fullRes=halfRes*halfRes;
        if(b%2!=0) fullRes=fullRes*a;
        return fullRes;
    }
    public static void main(String[] args){
        System.out.println(Power(3,4));

    }
}
