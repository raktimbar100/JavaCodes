import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the Item you want to Search");
        int key=sc.nextInt();
        int  b=linearSearch(arr,key);
        if(b==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
    static int linearSearch(int[] arr,int key)
    {
        if(arr[0]==key)
            return 1;
        if(arr.length==0)
            return -1;

        for(int i=1;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                return 1;
            }
        }
        return -1;
    }
}
