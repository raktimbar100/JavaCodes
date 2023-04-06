import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init = sc.nextInt();
        int fin = sc.nextInt();
        prime(init, fin);
    }

    static void prime(int init, int fin) {
        for (int i = init; i <= fin; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        int c = 2;
        if (num == 1 || num == 0)
            return false;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;

    }
}
