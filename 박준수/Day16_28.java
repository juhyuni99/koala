import java.util.*;

public class Day16_28 {
    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;     // Edge 클래스타입 ArrayList

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        A = new ArrayList[N+1];
        for (int i = 1; i <= N ; i++) {
            A[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < N; i++) {       //A인접 리스트에 그래프 데이터 저장
            int S = scan.nextInt();
            while (true){
                int E = scan.nextInt();
                if(E == -1)
                    break;
                int V = scan.nextInt();
                A[S].add(new Edge(E,V));
            }
        }
        distance = new int[N+1];            // 가중치 합을 담을 배열 초기화
        visited = new boolean[N+1];         // 방문 체크 배열 초기화
        BFS(1);                       //임이의 점을 시작점으로 BFS
        int Max = 1;
        for (int i = 2; i <= N ; i++) {
            if(distance[Max] < distance[i])
                Max = i;                    //임의의 점으로부터 거리가 먼 인덱스 찾음
        }
        distance = new int[N+1];            // 다시 초기화
        visited = new boolean[N+1];
        BFS(Max);                           // 찾은 Max인덱스로 다시 BFS
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    private static void BFS(int index){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty()){
            int now = queue.poll();
            for(Edge i: A[now]){
                int e = i.e;
                int v = i.value;
                if(!visited[e]){
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now]+v;      //가중치를 더함으로서 거리의 합을 구함
                }
            }
        }
    }



    static class Edge{      //정점과 가중치를 담을 클래스
        int e;
        int value;
        public Edge(int e, int value){
            this.e = e;
            this.value = value;
        }
    }


}
