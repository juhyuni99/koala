import java.util.Scanner;

public class Day19_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        long start = 1;
        long end = K;

        // B[k] = x에 대해 x는 start <= x <= end 안의 수이다.
        while (start < end){
            long mid = (start + end) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                count += Math.min(mid / i, N);  // N을 초과하지 않는 선에서 합해주어야함
            }

            //
            if(K <= count){         // x를 줄여
                end = mid;
            }
            else{                  // x를 늘려
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
}

// B[k] = x라는 의미는 x보다 작거나 같은 원소의 개수가 최소 k개라는 의미
// B[k]에서 k라는 것은 B[k]의 원소값보다 작거나 같은 원소의 개수를 의미
// x값을 조정해 나가면서 x보다 작거나 같은 원소의 개수가 k값이랑 일치하면된다.