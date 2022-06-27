package Arrays;

//for every c :find a+b such that a+b=x-c
public class threeSumUnsorted {
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


}
