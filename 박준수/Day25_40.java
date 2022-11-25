import java.util.Arrays;
import java.util.Scanner;

public class Day25_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long min = scan.nextLong();
        long max = scan.nextLong();

        boolean[] check = new boolean[(int)(max-min+1)];

        for (long i = 2; i*i <= max ; i++) {
            long pow = i*i;
            long startIndex = min/pow;
            if(min % pow != 0) startIndex++;
            for (long j = startIndex; pow*j <= max; j++) {
                check[(int) ((j * pow)-min)] = true;            // 제곱수인 숫자들을 true로 바꿈
            }
        }
        int count = 0;
        for (int i = 0; i <= max - min; i++) {
            if(!check[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}


// 4 4*2 4*3 4*4...
// 9 9*2 9*3 9*4...
// 16 16*2 16*3 ....