import java.util.Scanner;
import java.util.Stack;

public class Day06_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();

        StringBuffer bf = new StringBuffer();
        int num=1;      //오름차순 수
        boolean result=true;
        for (int i = 0; i < A.length; i++) {
            int su=A[i];        //현재 수열의 수
            if (su >= num) {    //현재 수열의 수>=오름차순 자연수 , 값이 같아질 때까지 push수행
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else{         //현재 수 값<오름차순 자연수 pop진행
                int n=stack.pop();
                if(n>su){       //스택의 가장 상위 값이 만들어야하는 수열 값보다 크면 불가능
                    System.out.println("NO");
                    result=false;
                    break;
                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
// 내가 푼 방법
/*
import java.util.Scanner;

public class Main {

    private static int []stack;
    private static int n;
    private static int top=-1;
    private static int count=0;     //1씩 오르며 스택에 저장하는 값
    private static char []check;    //부호 저장할 배열
    private static int index=0;     //check의 인덱스
    private static int error=0;     //수열 안될 경우 ++

    public static void input(){
        int pre;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        stack = new int[n];
        check=new char[2*n];

        for (int i = 1; i <= n; i++) {
            pre= sc.nextInt();
            if(count<pre){          //오름차순 이므로 이 경우에는 푸쉬를 해줘야 함
                while(pre>count){
                    push();
                }
            }
            pop(pre);
        }
        if(error==0) {
            print();    //부호 출력메서드
        } else{
            System.out.println("NO");
        }
    }

    public static void pop(int pre) {
        if(stack[top]!=pre){            //불가 할 경우 No출력
            error++;
        }
        top--;
        check[index++]='-';
    }

    public static void push() {
        stack[++top]=++count;
        check[index++]='+';
    }

    public static void print() {
        for (int i=0;i< 2*n;i++) {
            System.out.println(check[i]);
        }
    }

    public static void main(String[] args) {
        input();
    }
}
*/
