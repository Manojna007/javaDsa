package Assignments;

public class kthBitSetOrNot {
    static boolean kthBit(int n, int k) {
        n = n >> k;
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(kthBit(4, 0));
    }
}
