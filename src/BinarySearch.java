import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        boolean b=bs(arr,key);
//        if(bs(arr,key))
//            System.out.println("Found");
//        else
//            System.out.println("Not Found");
        System.out.println(b);
    }
    static boolean bs(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return true;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }

        }

        return false;
    }
}
