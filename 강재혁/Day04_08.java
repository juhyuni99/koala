import java.util.Arrays;
import java.util.Scanner;

public class Day04_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int []num;
        int count=0;
        int start,end;

        N=scanner.nextInt();
        num = new int[N];

        for (int i = 0; i < N; i++) {       //N개의 수 입력
            num[i]= scanner.nextInt();
        }
        Arrays.sort(num);   //오름차순 정렬

        for (int i = 0; i < N; i++) {
            start=0;
            end=N-1;
            while (start!=end) {
                if(start==i) {  //i랑 겹치면 건너뛰기
                    start++;
                    continue;
                } else if(end==i){  //i랑 겹치면 건너뛰기
                    end--;
                    continue;
                }
                int pre=num[start]+num[end];        //두 수의 합
                if(pre==num[i]){
                    count++;
                    break;
                } else if (pre<num[i]){     //합이 더 작을 경우 start++
                    start++;
                } else if (pre > num[i]) {      //합이 더 클 경우 end++
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}