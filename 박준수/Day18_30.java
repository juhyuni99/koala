import java.util.Scanner;

public class Day18_30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int A[] = new int [N];
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {       // M이 될 수 있는 최대 크기와 최소 크기를 구한다.
            A[i] = scan.nextInt();
            if(start < A[i]) start = A[i];
            end = end + A[i];
        }

        while(start <= end){
            int middle = (start + end)/2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if(sum + A[i] > middle){
                    count++;
                    sum = 0;
                }
                sum += A[i];
            }

            if(sum != 0)  // for문 이후에 남은 sum이 0이 아니면 묶음 1더해줌
                count++;
            if(count > M)   // count가 M보다 크다는 의미는 묶음안에 숫자를 더 많이 들어갈 수 있게 해야한다.
                start = middle + 1; //중앙값을 늘려서 숫자들을 더 많이 넣어 묶음들을 줄인다.
            else
                end = middle - 1;   // 중앙값을 줄여서 숫자들을 많이 안넣게해 묶음들을 늘린다.
        }
        System.out.println(start);
    }
}
