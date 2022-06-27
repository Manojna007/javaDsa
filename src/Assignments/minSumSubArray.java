package Assignments;

public class minSumSubArray {
    static int minsum(int a[]){
        int curSum=0;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            curSum+=a[i];
            if(minSum>curSum) minSum=curSum;
            //if(curSum>0)  curSum=0;
        }
        return minSum;
    }

    public static void main(String[] args){
        int a[]={-2,-3,7,-6,4,1,-3,8};
        int ans=minsum(a);
        System.out.println(ans);
    }
}


