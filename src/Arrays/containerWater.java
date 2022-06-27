package Arrays;

//Container with most water: largest rectangle contains most water
//method: two pointer technique: water fills wrt smallest of 2 poles

public class containerWater {
    public static int container(int a[]){
        int maxArea=0;
        int l=0;
        int r=a.length-1;
        while(l<r){
            int height=Math.min(a[l],a[r]);
            int dist=r-l;

            int area=height*dist;
            maxArea=Math.max(maxArea,area);

            if(a[l]<a[r]){
                l++;
            } else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int a[]={1,8,6,2,4,5,8,3,7};
        int ans=container(a);
        System.out.println(ans);
    }
}
