package Arrays;

public class trappingRainWater {
    static int  trap(int a[]){
        int ans=0;
        int leftmax=0,rightmax=0;
        int l=0,r=a.length-1;
        while(l<r){
            if(a[l]<=a[r]){
                if(a[l]>leftmax) leftmax=a[l];
                else ans+=(leftmax-a[l]);
                l++;
            }else{
                if(a[r]>rightmax) rightmax=a[r];
                else ans+=(rightmax-a[r]);
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        //int a[]={3,5,1,4,2,6};
        int a[]={3,4,5,1,7,2,6,5,4,1};
        int ans=trap(a);
        System.out.println(ans);
    }
}
