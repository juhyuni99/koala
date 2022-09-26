import java.io.*;
import java.util.Stack;

public class Day06_12 {     //스택에 값이 아닌 수열의 인덱스를 저장하는 것이 포인트
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());;
        int[] A= new int[N];
        int[] ans= new int[N];
        String[] str= bf.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i]= Integer.parseInt(str[i]);
        }

        Stack<Integer> stack=new Stack<>();
        stack.push(0);  //스택이 비어있으므로 최초값을 푸시해서 스택 초기화

        for (int i = 1; i < N; i++) {
            //스택이 비어있지 않고 현재 수열의 값이 스택에 저장된 수열의 값보다 클 때까지 pop
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                ans[stack.pop()]=A[i];  //정답 배열에 저장
            }
            stack.push(i);    //인덱스 push
        }

        while(!stack.isEmpty()){        //스택에 남은 갯수만큼 인덱스 값을 빼와서 -1저장
            ans[stack.pop()]=-1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {       //출력
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.close();
    }
}
//내가 짠 코드
/*  시간 초과 ㅠㅠ 위의 코드를 쓰더라도 Scanner를 이용하면 시간초과가 난다
import java.util.Scanner;
        import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int[] A;
        int Max;
        N=sc.nextInt();
        A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }

        Stack<Integer> stack=new Stack<>();
        StringBuffer bf = new StringBuffer();

        for (int i = 0; i < N; i++) {
            Max=-1;
            for (int j = i + 1; j < N; j++) {
                stack.push(A[j]);
            }
            while(!stack.isEmpty()){
                int temp=stack.pop();
                if(temp>A[i])Max=temp;
            }
            System.out.print(Max+" ");
        }
    }
}
*/
