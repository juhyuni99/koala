import java.util.Scanner;

public class Day11_21 {
    public static int A[], tmp[];
    public static long result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        A = new int[N + 1];
        tmp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        result = 0;
        merge_sort(1, N);
        System.out.println(result);
    }
        private static void merge_sort(int left, int right) {
            if (right - left < 1) return;  // 부분리스트가 1개의 원소만 가지고 있을 경우 더이상 쪼갤수 없다.
            int m = (left + right) / 2;  // 절반 위치
            merge_sort(left, m);        // 절반 중 왼쪽 부분리스트 정렬
            merge_sort(m+1, right);       // 절반 중 오른쪽 부분 리스트 정렬
            for (int i = left; i <= right; i++) {       // 두 부분을 '정렬된 상태'로
                tmp[i] = A[i];
            }
            int l = left;   // 왼쪽 부분리스트 시작점
            int r = m + 1;    // 오른쪽 부분리스트 시작점
            int index = left;  // 채워넣을 배열의 인덱스

            while (l <= m && r <= right){      //두 그룹을 병렬
                if(tmp[l] > tmp[r]){        // 뒤 그룹의 데이터 값이 더 작아 swap이 이루어진다 가정
                    A[index] = tmp[r];
                    result = result + r - index; // 현재 남아 잇는 앞쪽 데이터 개수 많큼 swap이 이루어짐
                    index++;
                    r++;
                }
                else {
                    A[index] = tmp[l];
                    index++;
                    l++;
                }
            }

            while (r <= right) {    //왼쪽 부분리스트가 먼저 모두 배열에 정렬 되었을 떄.
                A[index] = tmp[r];  // 오른쪽 부분리스트의 나머지 원소들 채워줌
                index++;
                r++;
            }
            while ( l <= m){        // 오른족 부분 리스트가 먼저 모드 배열에 정렬 되었을 때.
                A[index] = tmp[l];  // 왼쪽 부분 리스트의 나머지 원소들 채워줌
                index++;
                l++;
            }

         }
}
