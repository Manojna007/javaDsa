package BinarySearch;
// TC: logn
public class binarySearchAlgo {
    static int binarySearch(int a[] , int key){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key) return mid;
            if(key>a[mid]) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        int a[]={1,5,9,11,16,57,88};
        int key=57;
        System.out.println(binarySearch(a,key));
    }
}
