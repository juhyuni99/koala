import java.util.ArrayList;
import java.util.Scanner;

public class Day14_25 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();     //노드의 개수
        int M = scan.nextInt();     //엣지의 개수

        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();       // 인접 리스트 초기화
        }

        for (int i = 0; i < M; i++) {
            int S = scan.nextInt();
            int E = scan.nextInt();

            A[S].add(E);        // 친구는 서로 된거이므로 둘다 추가
            A[E].add(S);
        }
        for (int i = 0; i < N; i++) {
            DFS(i, 1);      // 깊이가 1이고 0부터 탐색
            if(arrive) break;       // arrive가 true가 되면 반복문 탈출
        }
        if(arrive) System.out.println("1");     // 깊이가 5인 관계가 하나라도 있으면 1을 출력
        else System.out.println("0");           // 하나라도 없으면 0을 출력
    }

    public static void DFS(int now, int depth){ //노드의 번호, 깊이
        if(depth == 5){    // 깊이가 5가되면 탐색 종료
            arrive = true;          // 깊이가 5가됨을 나타냄
            return;
        }
        visited[now]= true;     // 방문 노드 true로 바꿈
        for(int i : A[now]){        // 노드와 연결된 다른 노드들 방문
            if(!visited[i]){        // 방문하지 않은 노드면
                DFS(i, depth + 1);  // 깊이를 하나 더하고 DFS
            }
        }
        visited[now] = false;       // 노드 하나의 방문이 다 끝나면 다른 노드의 방문탐색을 위해 now의 방문여부를 false로 바꾼다.
    }

}
