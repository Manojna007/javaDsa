package Recursion;


import java.io.*;

class josephus {

    static int jose(int n, int k)
    {
        if (n == 1)
            return 1;
        else
    /* The position returned by josephus(n - 1, k)
    is adjusted because the recursive call
    josephus(n - 1, k) considers the original
    position k%n + 1 as position 1 */
            return (jose(n - 1, k) + k-1) % n + 1;
    }

    // Driver Program to test above function
    public static void main(String[] args)
    {
        int n = 5;
        int k = 3;
        System.out.println("The chosen place is " +
                jose(n, k));
    }
}

