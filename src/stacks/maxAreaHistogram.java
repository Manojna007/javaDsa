package stacks;
//brute force
public class maxAreaHistogram {
    static int maxArea(int a[]){
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0&&a[l]>=a[i] ) l--;
            while(r<n && a[r]>=a[i]) r++;

            int width=r-l-1;
            int curArea=a[i]*width;
            max=Math.max(max,curArea);

        }
        return max;
    }
    public static void main(String [] args){
        int a[]={4,2,1,4,3,0,2,3};
        System.out.println(maxArea(a));
    }
}
