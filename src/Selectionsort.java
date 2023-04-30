 static void selection(int[] nums)
    {
        for(int i=0;i< nums.length;i++)
        {
            int lastIndex=nums.length-i-1;
            int maxIndex=getMax(nums,0,lastIndex);
            swap(nums,maxIndex,lastIndex);
        }

    }
    static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int getMax(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
