class Lc {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicates(arr);
        System.out.println(k);
    }
     static int removeDuplicates(int[] nums) {
         int p=1;
         for(int i=0;i<nums.length-1;i++)
         {
             if(nums[i]!=nums[i+1])
             {
                 nums[p]=nums[i+1];
                 p++;
             }
         }
         return p;
    }
}
