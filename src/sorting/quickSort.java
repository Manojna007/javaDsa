package sorting;
//in-memory sorting O(nlogn), O(n)-space

public class quickSort {
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void random(int a[] ,int l,int h){
        int rand=l+ (int) (Math.random()*(h-l+1));
        swap(a,l,rand);
    }
    // to choose random element as pivot element
    static int partition(int a[], int l,int h) {
        int i = l;
        int j = h;
        random(a,l,h);
        int pivot = a[l];
        while (i < j) {
            while (i<j && a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a,l,j);
        return j;
    }
    static void quick(int a[], int l,int h){
        if(l<h){
            int pivot=partition(a,l,h);
            quick(a,l,pivot-1);
            quick(a,pivot+1,h);
        }
    }
    public static void main(String[] args){
        int a[]={6,3,9,1,4,2,7};
        quick(a,0,a.length-1);
        for(int e:a){
            System.out.print(e+ " ");
        }
    }
}
