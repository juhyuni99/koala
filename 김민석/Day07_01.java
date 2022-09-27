import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Day07_01 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int i,ans=0;
        for(i=1;i<=N;i++){
            que.add(i);
        }
       while(que.size()>1){
           que.poll();
           que.add(que.poll());
       }
       System.out.print(que.poll());
    }
}