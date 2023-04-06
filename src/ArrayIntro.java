import java.util.Arrays;
import java.util.Scanner;

class ArrayIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //store roll number
//        int roll=10;
        //store persons name
//        String name="Raktim";
        //Question:Store 10 roll no.
//        int r1=100;
//        int r2=101;
//        int r3=102;
//        int r4=103;
//        int r5=104;
//        int r6=105;
//        int r7=106;
//        int r8=107;
//        int r9=108;
//        int r10=109;
        //Question store 1000 roll nos.
        //Now creating 1000 variable of roll is very time and space consuming
        //Array:Group of some homogeneous datatypes,objects,complex datatype etc
        //syntax : datatype[] varName=new datatype[size];
        //5 roll number using Array
       // int[] rollNo=new int[5];
       // String[] stuName={"Raktim","Ram","Shyam"};
       // int[] eid;//Declaration of array happens and eid defined in stack at compile time.
        //eid=new int[6];//actually object is created here in Heap at runtime called Dynamic memory allocation.
        //for integer array by default at beginning the value of array at every index is 0 .In case of String there is null.
        //[0,0,0,0,0,0] for integer [null,null,null,null,null,null] for String
//        int[] arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        //Normal For loop
//        for(int j=0;j<arr.length;j++){
//            System.out.println(arr[j]);
//        }
        //Enhanced For loop
//        for(int j:arr){
//            System.out.println(j);
//        }

        //Array of objects.
//        String[] str=new String[3];
//        for(int i=0;i<str.length;i++){
//            str[i]=sc.next();
//        }
//        for(String j:str){
//            System.out.println(j);
//        }

        //passing by the copy of the reference
//        int[] arr=new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        changeVal(arr);
//        System.out.println(Arrays.toString(arr));
//        String[] s={"Raktim","Modhu"};
//        change(s);
//        System.out.println(Arrays.toString(s));
    }
//    static void changeVal(int[] arr){
//        arr[2]=100;
//    }
//    static void change(String[] st){
//        st[0]="Mohim";
//    }
}
