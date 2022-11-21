import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Day20_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int money = scan.nextInt();
            value.add(money);
        }

        int count = 0;
        int i = 1;
        while (K != 0){
            if(K/value.get(N-i) != 0){
                count += K/value.get(N-i);
                K %= value.get(N-i);
            }
            i++;
        }
        System.out.println(count);
    }
}
