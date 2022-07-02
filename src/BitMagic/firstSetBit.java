package BitMagic;
import java.util.*;
import java.lang.*;
import java.io.*;

public class firstSetBit {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//taking testcases
        while(t-->0){
            int n=sc.nextInt();//input n
            firstSetBit ob=new firstSetBit();
            System.out.println("first setBit is : "+ob.getFirstSetBit(n));//calling method
        }
    }

// } Driver Code End
//User function Template for Java
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){

        // Your code here
        if(n==0) return 0;
        int pos=0;
        while(n>0 &&(n&1)==0){
            n=n>>1;
            pos++;
        }

        return ++pos;
    }


}
