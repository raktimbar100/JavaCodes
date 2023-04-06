import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
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
