import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int power=pow(n,p);
        System.out.println(power);
    }
    static int pow(int n,int p){
        int mul=1;
        for(int i=1;i<=p;i++){
            mul*=n;

        }
        return mul;
    }
}
