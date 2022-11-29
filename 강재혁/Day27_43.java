import java.util.Scanner;

public class Day27_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long getGcd = gcd(A, B);
        StringBuilder result = new StringBuilder();
        while (getGcd-- > 0) {
            result.append("1");
        }
        System.out.println(result.toString());
    }

    private static long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
