import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day17_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            set.add(temp);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            if (set.contains(temp)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
