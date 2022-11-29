import java.util.Scanner;

public class Day27_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int getGcd, lcm;
        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            getGcd = gcd(a, b);     //최대 공약수 구하기

            a = a / getGcd;
            b = b / getGcd;
            lcm = getGcd * a * b;   //최소 공배수 구하기
            System.out.println(lcm);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
