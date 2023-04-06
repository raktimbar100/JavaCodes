import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayListEmp {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(10);
//        list.add(20);
//        list.add(90);
//        System.out.println(list);
//        list.set(1,89);
//        System.out.println(list.contains(10));
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.get(0));
        //MultiDimensional ArrayList
        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
//        for(int i=0;i<3;i++)
//        {
//            l.add(new ArrayList<>());
//        }
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                l.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list);
        //Q:Swap 2 values of 2 given index in an array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        swap(arr, 1, 3);
        max(arr);
        System.out.println(Arrays.toString(arr));
        int maxN = maxRange(arr, 0, 2);
        System.out.println(maxN);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void max(int[] arr) {
        int max = arr[0];
        //or
        //int max=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //System.out.println("Max val is "+max);
    }

    static int maxRange(int[] arr2, int index1, int index2) {
        int max = Integer.MIN_VALUE;
        if (index2 > arr2.length || index1 > arr2.length)
            return -1;
        for (int i = index1; i <= index2; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        return max;
    }

    static void reverseArray(int[] arr1) {
        int start = 0;
        int end = arr1.length - 1;
        while (start <= end) {
            swap(arr1, start, end);
            start++;
            end--;
        }
    }
}


