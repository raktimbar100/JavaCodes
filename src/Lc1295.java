import java.util.Scanner;

class Lc1295 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       int res= findEvenNoOfDigit(arr);
        System.out.println(res);
    }
    static int findEvenNoOfDigit(int[] arr)
    {
        int count=0;
        for (int j : arr) {
            int dig = (int) (Math.log10(j) + 1);
            if (dig % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

}
