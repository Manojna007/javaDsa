package Arrays;
// max of j-i such that a[j]>a[i]


public class maxjminusi {
    static int maxj(int a[]) {
        int n = a.length;
        int[] rightmax = new int[n];
        int[] leftmin = new int[n];

        rightmax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightmax[i] = Math.max(rightmax[i + 1], a[i]);

        leftmin[0] = a[0];
        for (int i = 1; i < n; i++)
            leftmin[i] = Math.min(leftmin[i - 1], a[i]);

        int i = 0, j = 0;

        int ans = 0;
        while (i < n && j < n) {
            if (leftmin[i] < rightmax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }

            public static void main(String[] args){
                int a[]={3,5,1,4,2,6};
                //int a[]={3,4,5,1,7,2,6,5,4,1};
                int ans=maxj(a);
                System.out.println(ans);
        }
    }

