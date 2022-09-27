import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Day07_14 {     //우선순위를 위해 compaer메서드를 오버라이드 해준 것이 포인트다
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>(){   //우선 순위 큐
        @Override
        public int compare(Integer a, Integer b){   //우선순위가 절대값이 작은 순서이기 때문에 compaer메서드를 오버라이드 해준다
            int A = Math.abs(a);
            int B = Math.abs(b);
            if(A>B) {                 //절댓값 기준 오름차순 이므로
                return A - B;
            } else if(A == B){
                if(a>b) return 1;
                else return -1;
            } else {
                return -1;
            }
            /*
            return A.compareTo(B)
            A기준 A가 크면 양수, 같으면 0, 작으면 음수

             */
        }
    });

        for (int i = 0; i < N; i++) {
            int pre=Integer.parseInt(bf.readLine());
            if(pre==0){     //0입력 할 경우
                if(priorityQueue.isEmpty()){    //0입력 했는데 큐가 비어있을 경우
                    System.out.println("0");
                } else{
                    int g=priorityQueue.poll();     //0입력 했는데 큐가 비어있지 않으면 우선순위 가장 높은 값 출력
                    System.out.println(g);
                }
            } else{     //0이 아닐 경우 큐에 add
                priorityQueue.offer(pre);
            }
        }
    }
}
