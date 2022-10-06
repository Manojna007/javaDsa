package BinarySearch;

public class countOccurrence {
    static int leftOccurrence(int a[] , int key){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key){
                ans=mid;
                r=mid-1;
            }
            if(key>a[mid]) l=mid+1;
            else r=mid-1;
        }
        return ans;
    }
    static int rightOccurrence(int a[] , int key){
        int l=0;
        int r=a.length-1;
        int res=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key){
                res=mid;
                l=mid+1;
            }
            if(key<a[mid]) r=mid-1;
            else l=mid+1;
        }
        return res;
    }
    public static void main(String[] args){
        int a[]={1,5,9,9,9,9,11,16,16,57,88};
        int key=9;
        int left= leftOccurrence(a,key);
       int right=rightOccurrence(a,key);
       int count = right-left+1;
       System.out.println(count);
    }
}
