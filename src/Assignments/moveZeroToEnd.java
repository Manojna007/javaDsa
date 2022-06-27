package Assignments;
/*
Input : arr[]  = {1, 2, 0, 0, 0, 3, 6}
Output : 1 2 3 6 0 0 0
*/
public class moveZeroToEnd {
    public static void move(int a[]){
        int count =0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        for(int i=count;i<n;i++)
            a[i]=0;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
    }

    public static void main(String[] args){
        int a[]={1, 2, 0, 0, 0, 3, 6};
        move(a);

    }
}
