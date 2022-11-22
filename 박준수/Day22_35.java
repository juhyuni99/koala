import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day22_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int [][]time = new int[N][2];

        for (int i = 0; i < N; i++) {
           time[i][0] = scan.nextInt();
           time[i][1] = scan.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if(S[1] == E[1]){   // 종료시간이 같으면
                    return S[0]-E[0];   // 시작 시간 빠른순으로 정렬
                }
                return S[1] - E[1]; //종료시간 다르면 종료시간 빠른순으로 정렬
             }
        });
        int count = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if(time[i][0] >= end){   // 회의가 겹치지 않게
                end = time[i][1];   //종료 시간 업데이트
                count++;
            }
        }
        System.out.println(count);
    }
}

