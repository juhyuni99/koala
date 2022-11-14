import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Day15_27 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);        // 깊이 결과 출력
    }

    public static void BFS(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;
        while (!queue.isEmpty()){
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {       // 상하좌우로 움직임
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && x < N && y>=0 && y < M){ // 표 범위
                    if(A[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;                   // 방문한 칸은 true로 변환
                        A[x][y] = A[now[0]][now[1]]+ 1;        // bfs 깊이 + 1
                        queue.add(new int[] {x,y});             // 다음 칸을 큐에 삽입해서 넘어감
                    }
                }
            }
        }
    }
}
