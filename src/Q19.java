import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        while(c<=n){
            if(n%c==0){
                if(isPrime(c)){
                    System.out.print(c+", ");
                }
            }
            c++;
        }
    }
    static boolean isPrime(int num){
        int c=2;
        if(num==1||num==0)
            return false;
        while(c*c<=num)
        {
            if(num%c==0){
                return  false;
            }
            c++;
        }
        return c*c>num;
    }
}
