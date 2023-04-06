import java.util.Scanner;

public class LsRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the Item you want to Search");
        int key = sc.nextInt();
        int in=sc.nextInt();
        int fi= sc.nextInt();
        int b = linearSearch(arr, key,in,fi);
        if (b == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }

    }
    static int linearSearch(int[] arr,int key,int in,int fi)
    {
        if(arr[0]==key)
            return 1;
        if(arr.length==0)
            return -1;

        for(int i=in;i<fi;i++)
        {
            if(key==arr[i])
            {
                return 1;
            }
        }
        return -1;
    }
}
