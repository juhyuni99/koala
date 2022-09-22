import java.util.Arrays;
import java.util.Scanner;
public class Day04_07 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long M = scan.nextLong();
        int Array[] = new int[N];
        for(int i = 0; i < N; i++){
            Array[i] = scan.nextInt();
        }
        Arrays.sort(Array);  // 2개의 숫자 합이 M이면 됨 오름차순으로 정렬


        int count = 0;

        int i = 0; // 작은 수 방향
        int j = N-1;    // 큰 수 방향


        while(i < j){       // 작은 수 포인터가 큰 수 포인터 만나기 전까지 반복
            if(Array[i] + Array[j] < M){    // 두 포인터의 합이 M보다 작으면
                i++;                        // 작은 포인터 증가
            }else if(Array[i] + Array[j] > M){  // 두 포인터의 합이 M보다 크면
                j--;                            // 큰 포인터 감소
            }else if(Array[i] + Array[j] == M){ // 두 포인터의 합이 같으면
                i++;                            // 두 포인터 모두 이동
                j--;                            // count 증가
                count++;
            }
        }
        System.out.print(count);
    }
}
