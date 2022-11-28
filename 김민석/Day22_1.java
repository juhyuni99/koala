
//회의실 배정 : https://www.acmicpc.net/problem/1931

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day22_1 {
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
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        int end=-1;
        for(int i=0;i<N;i++){
            if(ary[i][0]>=end){
                end=ary[i][1];
                ans++;
            }
        }
        System.out.print(ans);
    }
}
