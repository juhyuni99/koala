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
            if(min % pow != 0){ //나머지가 있으면 1을 더해야 Min보다 큰 제곱수에서 시작함
                startIndex++;
            }
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
