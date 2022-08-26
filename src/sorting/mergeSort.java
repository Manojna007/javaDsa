package sorting;

public class mergeSort {
    static void Mergesort(int a[] , int l, int h){
        if(l<h){
            int mid=(l+h)/2;
            Mergesort(a,l,mid);
            Mergesort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    static void merge(int [] a,int l,int mid,int h){
        int b[] = new int[a.length];
        int i=l; //left subarray
        int j=mid+1; //right subarray
        int k=l;// b array

        while(i<=mid && j<=h){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            } else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid) {
            while (j <= h) {
                b[k] = a[j];
                k++;
                j++;
            }
        }
            else{
                while(i<=mid){
                    b[k]=a[i];
                    k++;i++;
                }
            }
            for(i=l;i<=h;i++){
                a[i]=b[i];
            }

    }
    public static void main(String[] args){
        int a[]={1,9,5,8,4,0,6,4,2,3,1,9};
        Mergesort(a,0,a.length-1);
        for(int e:a) System.out.print(e+ " ");
    }
}
