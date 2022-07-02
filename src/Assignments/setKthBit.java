package Assignments;

public class setKthBit {
    static int kSet(int n,int k){
        return (n|1<<k);
    }
    public static void main(String[] args){
        int n=10,k=2;
        System.out.println(kSet(n,k));
    }
}
