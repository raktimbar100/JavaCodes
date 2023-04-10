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
        int index=search(arr,key);
        System.out.println(index);
    }
    static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            if(nums[mid]>target){
                end=mid-1;
            }

        }

        return -1;
    }
}
