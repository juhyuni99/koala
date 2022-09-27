import java.util.*;

import static java.lang.Math.abs;

public class Day07_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs)
                return o1 > o2 ? 1: -1; // 절댓값이 같으면 음수 우선 정렬하기
            else
                return first_abs - second_abs;  // 절댓값을 기준으로 정렬하기
        });

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            if(num != 0){       // 0아닐때
                priorityQueue.add(num);
            }else {            // 0일때
                if (priorityQueue.isEmpty()) System.out.println(0); // 우선순위 큐가 비어있을때
                else System.out.println(priorityQueue.poll());      // 안비어 있을떄
            }
        }
    }
}
