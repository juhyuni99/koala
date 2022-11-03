import java.util.ArrayList;
import java.util.Scanner;

public class Day13_23 {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i < A.length; i++) {
            A[i]= new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++){
            int s = scan.nextInt();
            int e = scan.nextInt();

            A[s].add(e);        // 방향이 없는 그래프이므로
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i < n+1 ; i++) {
            if(!visited[i]){        // 방문하지 않는 노드가 없을때까지 반복하기
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(visited[i] == false){    // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                DFS(i);                 // 재귀함수가 마치 스택과 같은 방식으로 처리됨
            }
        }
    }
}
