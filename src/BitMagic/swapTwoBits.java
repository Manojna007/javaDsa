package BitMagic;

// right shit number by i and j to find ith and jth bit values
// ith xor jth bit=0 then both value is same - no need to swap
// if its 1 then swap ith and jth bit value
// how to swap? - toggle the bit values: xor ith and jth bit by 1

public class swapTwoBits {
    static int swapBits(int n, int i, int j){
        int ith= (n>>i) &1;
        int jth= (n>>j) &1;
        int xor = ith^jth;

        if(xor==0) return n;

        int mask= (1<<i)| (i<<j);
        return n^mask;
    }
    public static void main(String[] args){
        System.out.println(swapBits(10,1,2));
    }

}
