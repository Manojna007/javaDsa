package Assignments;
// print frequency of all elements in a sorted array
/*
Input: arr[] = {2, 2, 6, 6, 7, 7, 7, 11}
Output:  Frequency of 2 is: 2
               Frequency of 6 is: 2
               Frequency of 7 is: 3
               Frequency of 11 is: 1

*/
public class Frequency {
    static void printFreq(int arr[], int N)
    {
        int freq = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            }
            else {
                System.out.println("Frequency of "
                        + arr[i - 1]
                        + " is: " + freq);
                freq = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println("Frequency of "
                + arr[N - 1]
                + " is: " + freq);
    }


    public static void main(String args[])
    {
        int arr[]
                = { 1, 1, 1, 2, 3, 3, 5, 5,
                8, 8, 8, 9, 9, 9};
        int N = arr.length;
        printFreq(arr, N);
    }
}

