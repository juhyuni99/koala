import java.util.Scanner;

public class Day23_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        boolean []prime = new boolean[N+1];

        prime[0] = prime[1] = true; // 0, 1은 소수가 아니므로 true
        for (int i = 2; i*i <= N ; i++) {
            if(!prime[i]){      // 소수이면
                for (int j = i*i; j <= N ; j+=i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = M; i <= N ; i++) {
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}

// 에라스토스테네스의 체를 사용