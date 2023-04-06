import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
