package Assignments;

public class rightMostDifferentBit {
    static int rightMostDiff(int m, int n){
        if(m==n) return -1;
        int count=1;
        while((m&1)==(n&1)){
            count++;
            m=m>>1;
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        int m=11,n=9;
        System.out.println(rightMostDiff(m,n));
    }
}
