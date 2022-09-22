import java.util.Arrays;
import java.util.Scanner;

public class Day04_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        int []num;  //고유 번호
        int start=0,end=1;
        int count=0;

        N= scanner.nextInt();
        M= scanner.nextInt();

        num=new int[N];

        for (int i = 0; i < N; i++) {    //고유 번호 입력
            num[i]=scanner.nextInt();
        }

        while (start < end && end<N) {
            if(num[start]+num[end]==M)count++;  //갑옷 생성가능 하면 count++
            end++;
            if(end==N){   //end가 인덱스 끝에 도달하면
                start++;    //시작지점 한칸 앞으로
                end=start+1;
            }
        }
        System.out.println(count);
    }
}
