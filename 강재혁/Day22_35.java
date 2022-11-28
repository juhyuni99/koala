import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Day22_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans=0;
        int ary[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            ary[i][0] = scan.nextInt();
            ary[i][1] = scan.nextInt();
        }

        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){   //종료 시간이 같을 때
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        int end=-1;
        for(int i=0;i<N;i++){
            if(ary[i][0]>=end){     //겹치지 않는 다음 회의가 나온 경우
                end=ary[i][1];      //종료시간 업데이트
                ans++;
            }
        }
        System.out.print(ans);
    }
}
