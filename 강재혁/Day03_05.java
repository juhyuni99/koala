import java.util.Scanner;

public class Day03_05 {
    public static void main(String[] args) {
        int N,M,sum=0;
        long []num;  //구간 합의 나머지가 인덱스 값인 배열
        Scanner scanner = new Scanner(System.in);

        N= scanner.nextInt();
        M= scanner.nextInt();

        num=new long[M];
        long pre;
        for (int i=0;i<N;i++) {
            pre=scanner.nextInt();
            sum+=pre;       //구간 합 계산
            sum%=M;     //나머지 계산
            num[sum]++;
        }

        pre=num[0];     //구간 합의 나머지가 0이 되는 값 더해주기
        for (int i=0; i < M; i++) {
            pre += (num[i] * (num[i] - 1)) / 2; //나머지가 같은 것들 중에서 2개를 순서없이 뽑기 (조합공식) -> (num[i])C2
        }

        System.out.println(pre);
    }
}