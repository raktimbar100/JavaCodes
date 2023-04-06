import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      fibbo(n);
    }
    static void fibbo(int n)
    {
        int a=0;
        int b=1,temp;

        int count=2;
        while(count<=n){
            temp=a+b;
            a=b;
            b=temp;
            //System.out.println(temp);
            count++;
        }
        System.out.println(b);
    }
}

