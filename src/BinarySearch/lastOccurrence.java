package BinarySearch;

public class lastOccurrence {
    static int rightOccurrence(int a[] , int key){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key){
                ans=mid;
                l=mid+1;
            }
            if(key<a[mid]) r=mid-1;
            else l=mid+1;
        }
        return ans;
    }
    public static void main(String[] args){
        int a[]={1,5,9,9,9,9,11,16,16,57,88};
        int key=16;
        System.out.println(rightOccurrence(a,key));
    }
}
