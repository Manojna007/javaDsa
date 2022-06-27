package Arrays;

//a[]={2,7,6,1,4,3}- leader element means element that do not have
// any larger element on their right side.


public class leaders {
     static void leader(int a[]){
         int b[]=new int[a.length];
         int j=0;
         int largest=Integer.MIN_VALUE;
         for(int i=a.length-1;i>=0;i--){
             if(a[i]>largest){
                 largest=a[i];
                 System.out.print(a[i]+" ");
                 //System.out.println(" ");
                 b[j++]=a[i];
             }
         }
         System.out.println(" ");
         System.out.println(" printing in correct order");
         for(j=j-1;j>=0;j--){
             System.out.println((b[j]+" "));
         }
     }

     public static void main(String[] args){
         int a[]={2,7,6,4,1,3};
         leader(a);

     }
}
