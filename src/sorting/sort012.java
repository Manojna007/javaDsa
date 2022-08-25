package sorting;

public class sort012 {


    static void Sort012(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else  {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


        public static void main (String[]args){
            int a[] = {2, 2, 1, 0, 0, 1, 2, 0, 1};
            Sort012(a);

        }

}