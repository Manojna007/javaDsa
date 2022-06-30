package BitMagic;

public class toggleIthBit {
    static int toggle(int n, int i) {
        int mask = 1 << i;
        int result = n ^ mask;
        return result;
    }

    public static void main(String[] args) {
        int n = 16, i = 2;
        System.out.println(toggle(n, i));
    }
}
