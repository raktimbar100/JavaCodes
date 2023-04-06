import java.util.Arrays;
import java.util.Scanner;

class MultiDimensional {
    public static void main(String[] args) {
        /*
          1  2  3
          4  5  6
          7  8  9
          3 row 3 columns
         */
        //syntax: dataType[][] varName=new dataType[][]//Number of rows is mandatory columns is not mandatory
//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[sc.nextInt()][sc.nextInt()];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        //Enhanced for loop
//        for(int[] j : arr){
//            System.out.println(Arrays.toString(j));
//        }
    }
}
