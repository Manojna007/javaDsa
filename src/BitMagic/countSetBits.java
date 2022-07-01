package BitMagic;
// if number is done & operation with 1- if last bit is 0 then res= 0
// if res is 1 then last bit is 1
// to find out number of digits in binary - log(base 2)n +1
// decimal digit- log(base 10)n +1

public class countSetBits {
    // TC- logn
    static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;

        }
        return count;
    }
    static int effectiveCount(int n){
        //jump directly to set bits instead of traversing all bits
        // n&(n-1) makes least significant set bit 0

        int count =0;
        while(n>0){
            System.out.println(n);
            count++;
           n= n&(n-1);


        }
        return count;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Naive approach of count set bits is :"+countBits(n));
        System.out.println("number of set bits is : "+effectiveCount(n));
    }
}
