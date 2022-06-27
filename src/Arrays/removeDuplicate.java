package Arrays;

//remove duplicate elements from a sorted array:O(n)
/*
if(a[i]!=a[j]){
    a[j+1]=a[i];
    j++;
   }

 */
public class removeDuplicate {
    public static int remove(int a[]){
        int start=0,end=0,flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[end]==a[start])
            {
                end++;
            }
            else
            {
                flag=1;
                ++start;
                a[start]=a[end];
                end++;

            }
        }
        if(flag==1)
            return start+1;
        else
        {
            return 1;
        }
    }
    public int removeDuplicates(int[] nums) {

        int count = 0;


        for (int i = 0; i<nums.length;i++)
        {

            if(i<nums.length-1 && nums[i] == nums[i+1])
            {
                continue;
            }

            nums[count]=nums[i];

            count++;
        }
        return count;
    }




    public static void main (String[]args){
        int a[]={2,2,3,4,4,7,7,7};
        int ans=remove(a);
        System.out.println(ans);
    }
}
