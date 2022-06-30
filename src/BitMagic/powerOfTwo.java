package BitMagic;
// if ith bit is 0- make it 1 and vice-versa
// hint: xor with 1 makes digit to toggle
// xor with 0 - digit remains as it is

public class powerOfTwo {
    static boolean ispow(int n){
        int res=n &(n-1);
        return res==0;
    }
    public static void main(String[] args){
        int n=16 ;
        System.out.println(ispow(n));
    }
}
