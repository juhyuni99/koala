import java.util.*;

public class Day15_26 {

    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int V = scan.nextInt();

        A = new ArrayList[N+1];


        for (int i = 1; i < N+1; i++) {     // A의 인접 리스트의 각 ArrayList 초기화하기
            A[i] = new ArrayList<>();
        }

        for (int i = 1; i < M+1; i++) {     //A 인전 리스트에 그래프 데이터 저장하기
            int S = scan.nextInt();
            int E = scan.nextInt();

            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i < N+1 ; i++) {    //정점 번호가 작은 것을 먼저 방문하기 위해 정렬
            Collections.sort(A[i]);
        }

        visited = new boolean[N+1];         // 방문배열 초기화
        DFS(V);
        System.out.println();
        visited = new boolean[N+1];
        BFS(V);
        System.out.println();
    }

    public static void DFS(int v){      //DFS방식 :  Stack사용(재귀 함수로 구현)
        if(visited[v]){
            return;
        }
        System.out.print(v + " ");
        visited[v] = true;
        for(int i : A[v]){
            if(visited[i] == false){
                DFS(i);
            }
        }
    }

    private static void BFS(int Node) {     //BFS 방식 : Queue사용(반복문 사용)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node] = true;

        while (!queue.isEmpty()){
            int nowNode = queue.poll();
            System.out.print(nowNode + " ");
            for(int i : A[nowNode]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }


}
