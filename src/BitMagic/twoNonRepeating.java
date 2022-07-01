package BitMagic;
// find 2 elements which is not repeatin twice while rest elements repeats twice
// make two categories : second least bit - set or unset
//O(n)

public class twoNonRepeating {
    static int[] twoNonRepeatEle(int[] a){
        int xor=0;
        for(int e:a){
            xor=xor^e;
        }
        int temp=xor;
        int mask=xor&(~(xor-1));
        for(int e:a){
            if((mask& e)==0){
                temp=temp^e;
            }
        }
        int firstNumber=temp;
        int secondNumber=xor^firstNumber;
        int res[]=new int[2];
        res[0]=firstNumber;
        res[1]=secondNumber;
        return res;

    }
    public static void main(String[] args){
        int a[]={2,1,4,1,2,3,4,7};
        int res[] =twoNonRepeatEle(a);
        System.out.println("first nonRepeating element is: "+res[0]);
        System.out.println("second nonRepeating element is: "+res[1]);

    }
}
