import java.util.Scanner;

public class Day13_24 {
    static int N;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        DFS(2,1);       // 1의 자리가 소수인 수는 2,3,5,7뿐임
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int number, int jarisu){
        if(jarisu == N){                         // 자리수가 N과 같으면 소수인지 판별하고 출력
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10 ; i++) {
            if(i % 2 == 0){                 // i가 짝수이면 소수일리없으므로 탐색할 필요가 없음
                continue;
            }
            if(isPrime(number * 10 + i)){   // 소수라면 재귀함수로 자릿수를늘림
                DFS(number * 10 + i, jarisu + 1);
            }
        }

    }
    static boolean isPrime(int num) {       // 소수판별 식
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
