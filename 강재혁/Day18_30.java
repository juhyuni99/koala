import java.util.Scanner;

public class Day18_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int start = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            if (start < A[i]) {     //레슨 최댓값을 시작 인덱스로 저장하기
                start = A[i];
            }
            end += A[i];    //모든 레슨들의 총합을 종료 인덱스로 저장하기
        }

        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < N; i++) {   //middle 값으로 모든 레슨을 저장할 수 있는지 확인
                if (sum + A[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum = sum + A[i];
            }

            if (sum != 0) {
                count++;
            }

            if (count > M) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start);
        scanner.close();
    }
}
