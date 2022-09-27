import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Day07_13 {     //카드를 뒤집어서 생각하면 편함
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        Queue<Integer> queue=new LinkedList<>();

        for (int i = 1; i <= N; i++) {      //1부터 N까지 차례대로 큐에 저장
            queue.add(i);
        }

        while (queue.size() != 1) { //큐에 하나 남을 때까지 진행
            queue.remove();         //큐에 첫번째 값 삭제
            int pre=queue.poll();   //그 다음값 삭제 후 pre에 저장
            queue.add(pre);         //pre값 큐에 푸시
        }
        System.out.println(queue.peek());

        //BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        //bw.write(queue.peek());
        //bw.close();
    }
}
