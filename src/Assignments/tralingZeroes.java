package Assignments;
/*
Example 1:

Input:
N = 5
Output:
1
Explanation:
5! = 120 so the number of trailing zero is 1.
*/

public class tralingZeroes {
   static int TrailingZeroes(int N)
    {
        // Write Your Code here
        int res=0;
        for(int i=5;i<=N;i=i*5){
            res=res+N/i;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(TrailingZeroes(4));

    }
}

// (2,5) pairs make a trailing zero (no of 5 is less than 2)
// integer division gives the floor value
// TC- theta(logn)- log(base 5)n
