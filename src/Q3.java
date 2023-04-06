import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of N natural number "+sum);
    }
}
