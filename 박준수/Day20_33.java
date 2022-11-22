import java.util.PriorityQueue;
import java.util.Scanner;

public class Day20_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int data = scan.nextInt();
            pq.add(data);
        }
        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        while (pq.size() != 1){
            data1  = pq.remove();
            data2 = pq.remove();
            sum += data1 + data2;
            pq.add(data1 + data2);
        }
        System.out.println(sum);
    }
}

// 우선순위 큐에 값을 넣으면 어느 정도 정렬된 상태가 됨
// 최소 우선순위 큐는 데이터를 뽑을 때 가장 작은 데이터 순으로 나옴