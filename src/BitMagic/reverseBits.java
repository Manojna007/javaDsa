package BitMagic;
// reverse the bits of an 32 bit unsigned integer
// important question***

public class reverseBits {
    static long reverse(long n){
        long res=0;
        int i=0;
        while(i<=31){
            if((n & (1<<i))!=0)
                res+= (1l<<31-i);// l added to explicitely make 1 from int to long
            i++;
        }
        return  res;
    }
    public static void main(String[] args){
        System.out.println(reverse(3));
    }


}
