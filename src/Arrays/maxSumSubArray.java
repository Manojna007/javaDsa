package Arrays;

//kadaine's algorithm: use cursum and maxsum
// cursum initially is zero, maxsum is -infinity


public class maxSumSubArray {
    static int maxsum(int a[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            curSum+=a[i];
            if(maxSum<curSum) maxSum=curSum;
            if(curSum<0)  curSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args){
        int a[]={-2,7,-6,4,1,-3,8};
        int ans=maxsum(a);
        System.out.println(ans);
    }
}
