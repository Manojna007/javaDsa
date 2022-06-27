package Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

// o(3^n) always see number of steps
public class ropeCut {
    static int maxRods(int N,int a,int b,int c){
        if(N==0) return 0;
        if(N <0) return -1;

        int cutA=maxRods(N-a,a,b,c);
        int cutB=maxRods(N-b,a,b,c);
        int cutC=maxRods(N-c,a,b,c);

        int res= Math.max(cutA,Math.max(cutB,cutC));
        if(res==-1) return -1;
        return res+1;//+1 is for initial cut

    }
    static int dp_maxRods(int N,int a,int b,int c,int[] dp){
        if(N==0) return dp[N]=0;
        if(N <0) return -1;
        if(dp[N]!= -2) return dp[N];

        int cutA=dp_maxRods(N-a,a,b,c,dp);
        int cutB=dp_maxRods(N-b,a,b,c,dp);
        int cutC=dp_maxRods(N-c,a,b,c,dp);

        int res= Math.max(cutA,Math.max(cutB,cutC));
        if(res==-1) return dp[N]=-1;
        return dp[N]=res+1;//+1 is for initial cut

    }

    public static void main(String[] args){
        int N=25;
        int a=6;
        int b=7;
        int c=13;
        int dp[]=new int[N+1];
        Arrays.fill(dp,-2);
        System.out.println("recursion method answer is:"+maxRods(N,a,b,c));
        System.out.println(dp_maxRods(N,a,b,c,dp));
        for(int i=0;i<=N;i++){
            System.out.println(i+" "+ dp[i]);
        }
    }
}
