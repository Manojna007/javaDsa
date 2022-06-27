package Arrays;

public class secondLargest {
    public static int second(int a[]) {
        if (a.length < 2) return -1;

        int largest = 0;
        int secondLargest = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[largest]) {
                secondLargest = largest;
                largest = i;

            } else if (a[i] < a[largest]) {
                if (secondLargest == -1 || a[i] > a[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

        public static void main (String[]args){
            int a[] = {1, 2, 7, 8, 10, 12};
            //int a[]={3,4,5,1,7,2,6,5,4,1};
           int index=second(a);
            System.out.println(a[index]);
        }
    }
