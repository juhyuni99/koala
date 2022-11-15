import java.util.Arrays;
import java.util.Scanner;

public class Day17_29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);

        int M = scan.nextInt();
        for (int i = 0; i < M; i++) {   //찾을 수의 개수 M 만큼 반복
            boolean find = false;
            int target = scan.nextInt();
            int start = 0;              // A배열 처음 인덱스
            int end = N - 1;            // A배열 마지막 인덱스
            while (start <= end) {      // 처음 인덱스가 마지막 인덱스와 같거나 작을때 반복
                int mid = (start + end) / 2;    // 중간값찾을 인덱스
                if (A[mid] > target) {          // 중간값이 타깃보다 크면
                    end = mid - 1;              // end 인덱스를 중간값 찾을 인덱스보다 하나 줄여 대입
                }else if (A[mid] < target) {    // 중간값이 타깃보타 작으면
                    start = mid + 1;            // start 인덱스를 중간값 찾을 인덱스보다 하나 늘려 대입
                }else {                         // 값을 찾았을때 반복문 종료
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
