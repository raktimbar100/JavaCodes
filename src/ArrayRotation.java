import java.util.Scanner;
import java.util.Arrays;
class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        rotateArray(arr,size,d);
    }
    static void rotateArray(int[] arr,int size,int d){
        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=1;j<size;j++){
                arr[j-1]=arr[j];

            }
            arr[size-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
