import java.util.Arrays;
import java.util.Scanner;

public class Day08_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]= scan.nextInt();
        }
        Arrays.sort(array);

        for (int n: array)
        {
            System.out.println(n);
        }
    }
}
