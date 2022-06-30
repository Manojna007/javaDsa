package BitMagic;

public class findIthBit {
    static int find(int n, int i) {
        int mask = 1 << i;
        int res = n & mask;
        if (res == 0) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int n = 15,i=2;
        System.out.println(find(n,i));
    }
}
