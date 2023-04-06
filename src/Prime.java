import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(primeCheck(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    static boolean primeCheck(int n)
    {
        if(n<=1){
            return false;
        }

            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }

        return c*c>n;
    }
}
