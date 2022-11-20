import java.util.PriorityQueue;
import java.util.Scanner;

public class Day20_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum=0;
        int data1=0,data2=0;
        PriorityQueue<Integer> Que =new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int data=scan.nextInt();
            Que.add(data);
        }
        while(Que.size()!=1) {
            data1 = Que.remove();
            data2 = Que.remove();
            sum = sum + data1 + data2;
            Que.add(data1+data2);
        }
        System.out.print(sum);
    }
}

