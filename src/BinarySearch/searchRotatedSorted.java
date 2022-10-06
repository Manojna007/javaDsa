package BinarySearch;
// a[]={4,5,7,8,9,1,2,3} it is a rotated sorted array
// key= 7
// no duplicates

public class searchRotatedSorted {
    static int rotated(int a[],int key){
        int l=0,r=a.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==key) return mid;
            if(a[l]<=a[mid]){
                if(key>=a[l] && key<a[mid]){
                    r=mid-1;
                }
                else
                    l=mid+1;
            }
            else{
                if(key>a[mid] && key<=a[r]){
                    l=mid+1;
                }
                else
                    r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={4,5,6,7,1,2,3};
        int key=2;
        System.out.println(rotated(a,key));
    }

}
