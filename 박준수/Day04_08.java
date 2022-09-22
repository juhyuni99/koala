import java.util.Arrays;
import java.util.Scanner;

public class Day04_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Array[] = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = scan.nextInt();
        }

        Arrays.sort(Array);
        int count = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;   // 작은 수 포인터
            int right = N - 1;  // 큰 수 포인터
            while (true) {      // 두수의 합으로 한번만 성공해서 COUNT++하고 break;
                if (left == i) left++;         //
                else if (right == i) right--;

                if (left >= right) break;    //작은 수 포인터가 큰 수 포인터 넘어가면 탐색 안됨
                if (Array[left] + Array[right] > Array[i]) right--;
                else if (Array[left] + Array[right] < Array[i]) left++;
                else if (Array[left] + Array[right] == Array[i]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
