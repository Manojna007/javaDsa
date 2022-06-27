package Arrays;
//sorted array find pair of elemts which adds up to a given sum


public class sortedArraySum {
    static boolean twosum(int a[],int sum){
        int l=0;
        int r=a.length-1;

        while(l<r){
            int curSum=a[l]+a[r];
            if(curSum>sum){
                r--;
            }else if(curSum<sum){
                l++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int a[]={1,2,7,8,10,12};
        //int a[]={3,4,5,1,7,2,6,5,4,1};
        int sum=10;
        System.out.println(twosum(a,sum));
    }
}
