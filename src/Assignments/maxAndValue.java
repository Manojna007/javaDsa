package Assignments;

public class maxAndValue {
   static int maxAND (int arr[], int N)
    {
        // Complete the function
        int ans=0;
        for(int i=31;i>=0;i--)
        {
            int count=0;
            int curr = ans|(1<<i);
            for(int j=0;j<N;j++)
            {
                if((curr&arr[j])==curr)
                    count++;
            }
            if(count>=2)
                ans = curr;
        }
        return ans;


    }
    public static void main(String[] args){
        int a[]= {4, 8, 12, 16};
        System.out.println(maxAND(a,4));
    }
}
