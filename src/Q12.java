import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPallindrome(n)==n){
            System.out.println("Pallindrom number ");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
    static int isPallindrome(int n){
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n/=10;
        }
        return sum;
    }
}
