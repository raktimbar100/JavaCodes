import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int f=sc.nextInt();
        int sum=0;
        for(int l=i;l<=f;l++){
            sum+=l;
        }
        System.out.println(sum);
    }
}
