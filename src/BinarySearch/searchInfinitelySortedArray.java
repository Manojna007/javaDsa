package BinarySearch;
/*without using r index
using range of sliced elements for ex range of 4
compare your element within the range , if not present then go to next range
then if key is within the range then apply binary search
for that range .
if range kept constant then it becomes linear
**therefore variable range (double)

*/

public class searchInfinitelySortedArray {
    static int binarySearch(int a[], int key, int l, int r) {
        while(l <= r) {
            int mid = (l+r)/2;
            if(a[mid] == key) return mid;
            if(key > a[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    static int infSort(int a[], int key){
        if(a.length==0) return -1;
        if(a[0]==key) return 0;
        int index=1;
        while(a[index]<=key){
            index*=2;
        }
        return binarySearch(a,key,index/2,index);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 17, 17, 19, 23, 25, 27, 28, 29, 31, 34, 35, 36};
		int key = 14;
        System.out.println(infSort(a,key));
    }


}
