import java.lang.reflect.Array;
import java.util.*;

public class Day21_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int []array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int left = 0;
        int right = N-1;
        int sum = 0;
        // 0, 음수일 경우 처리
        for(; left<right; left+=2){
            if(array[left] < 1 && array[left+1] < 1){
                sum += array[left]*array[left+1];
            }else{
                break;
            }
        }
        // 양수일 경우 처리
        for(; right > 0; right-=2){
            if(array[right] > 1 && array[right-1] > 1){
                sum += array[right]*array[right-1];
            }else{
                break;
            }
        }
        //남은 값들 더해주기
        for(; right >= left; right--){
            sum += array[right];
        }
        System.out.println(sum);
    }
}

// 조건 1. 음수 * 음수, 양수 * 양수가 최댓값, 단 (양수*1)은 (양수+1)값보다 작으므로 조건처리
// 조건 2. 음수*0은 최댓값