package sorting;
//a[]=[2,5,5,6,6,8,8]
//b[]=[1,1,2,3,6,6,9]
// intersection of 2 sorted arrays into one array
//ans[]=[2,6,6]

public class intersection2sorted {
    static void intersection(int a[],int b[]){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;j++;

            }else if(a[i]>b[j]){
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
        }
    }
    public static void main(String [] args){
        int a[]={2,5,5,6,6,8,8};
        int b[]={1,1,2,3,6,6,9};
        intersection(a,b);
    }
}
