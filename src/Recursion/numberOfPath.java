package Recursion;

//number of path in n*m matrix
// can go only right or down without any hurdles

public class numberOfPath {
    static int countPath(int n, int m){
        if(n==1 || m==1) return 1;
        int rightSideAns=countPath(n,m-1);
        int downSideAns=countPath(n-1,m);

        return rightSideAns+downSideAns;
    }

    public static void main(String[] args){
       int ans= countPath(3,4);
       System.out.println(ans);

    }
}
