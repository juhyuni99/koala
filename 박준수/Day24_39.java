import java.util.Arrays;
import java.util.Scanner;

public class Day24_39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        boolean []prime = new boolean[10000001];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i <= 10000000; i++) {
            if(prime[i]){
                for (int j = 2; j*i <= 10000000; j++) {
                    prime[j*i] = false;
                }
            }
        }

        String num = null;
        for (int i = N; i <= 10000000 ; i++) {
            if (prime[i]) {
                num = Integer.toString(i);
                StringBuilder sb = new StringBuilder(num);
                String reverse = sb.reverse().toString();
                if (num.equals(reverse)) break;
            }
        }
        System.out.println(num);
    }
}

//N의 범위는 1 ~ 1000000이지만 출력값의 범위는 1000000이상입니다.
