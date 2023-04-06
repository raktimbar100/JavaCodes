import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int) (Math.log10(n) + 1);
        int res=armStrong(n,len);
        if (res== n) {
            System.out.println("Armstrong Number ");

        } else {
            System.out.println("Not Armstrong");
        }
    }

    static int armStrong(int n, int len) {
        int rem, sum = 0;
        if (n != 2 && n != 3 && n != 4 && n != 5 && n != 6 && n != 7 && n != 8 && n != 9) {
            while (n > 0) {
                rem = n % 10;
                sum += Math.pow(rem, len);
                n /= 10;
            }
            return sum;
        }

            return -1;


    }
    }

