import java.util.Scanner;

public class Day27_43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long A = scan.nextLong();
        long B = scan.nextLong();
        long count = getGcd(A,B);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(1);
        }
        System.out.println(sb);

    }

    public static long getGcd(long n, long m){
        if(n % m == 0){
            return m;
        }
        return getGcd(m, n%m);
    }

}
