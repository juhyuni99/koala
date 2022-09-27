import java.util.Scanner;
import java.util.Stack;

public class Day06_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = scan.nextInt();

        int start = 0;

        while (n --> 0){
            int value = scan.nextInt();

            if(value > start){
                //start + 1 부터 입력받은 value 까지 push를 한다.
                for (int i = start+1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value;      // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }

            else if(stack.peek() != value) { // top에 있는 원소가 입력받은 값과 같이 않을경우
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);
    }
}
