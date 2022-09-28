import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day08_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int len=str.length();
        int[] A = new int[len];

        for (int i = 0; i < len; i++) { //String을 한글자씩 숫자로 int배열에 넣기
            A[i]=str.charAt(i)-'0';
        }

        for (int i = len-1; i >0; i--) {      //버블정렬
            for (int j = 0; j < i; j++) {
                int pre;
                if(A[j]<A[j+1]){        //(1,2)비교 (2,3)비교...한번 돌면 마지막 인덱스는 고정이므로 i--
                    pre=A[j];
                    A[j] = A[j + 1];
                    A[j+1]=pre;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(A[i]);
        }
    }
}
