import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibbo(n);
    }
    static void fibbo(int n)
    {
        int a=0;
        int b=1,temp;
        n-=2;
        System.out.println(a);
        System.out.println(b);
        while(n>0){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
            n--;
        }
    }
}
