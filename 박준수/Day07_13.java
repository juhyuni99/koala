import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Day07_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            q.add(i+1);
        }

        while (q.size() != 1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.peek());
    }
}
