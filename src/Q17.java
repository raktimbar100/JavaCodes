import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=facto(n);
        System.out.println(res);
    }
    static int facto(int n){
            int mul=1;
        for(int i=n;i>=1;i--)
        {
            mul*=i;
        }
        return mul;
    }
}
