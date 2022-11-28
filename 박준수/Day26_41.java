import java.util.Scanner;

public class Day26_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long result = N;
        for (long p = 2; p * p <= N; p++) {
            if (N % p == 0) {        //소인수 확인
                result = result - result / p;  // 오일리 함수 사용
                while (N % p == 0) {            // 2^7 * 11 이라면 2^7을 없애고 11만 남김
                    N /= p;
                }
            }
        }
        if (N > 1) {        // 반복문에서 제곱근까지만 탐색했으므로 1개의 소인수만 누락되는 케이스가 있으므로 한 번더 오일러함수 사용
            result = result - result / N;
        }
        System.out.println(result);

    }
}
