import java.util.Arrays;

class VarArgs {
    public static void main(String[] args) {
        num(1,23,4,5,6);
    }
    static void num(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//[1, 23, 4, 5, 6]