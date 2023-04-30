import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,6,7,-99};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr)
    {
        boolean flag;
        for(int i=0;i<arr.length-1;i++)
        {
            flag=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(!flag)
            {
                break;
            }

        }
        return arr;
    }
}
