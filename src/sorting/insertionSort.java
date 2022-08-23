package sorting;

public class insertionSort {
    static void insertion(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int temp=a[i];

            for(;j>=0;j--){

                if(temp<a[j]){
                    a[j+1]=a[j];
                } else{

                    break;
                }
            }
            a[j+1]=temp;
            printArray(a);
            System.out.println();
        }
    }
    static void printArray(int a[]){
        for(int e:a){
            System.out.print(e+" ");
        }
    }
    public static void main(String [] args){
        int a[] ={9,5,2,6,3,1,3};
        insertion(a);
        printArray(a);
    }

}
