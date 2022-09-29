import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day09_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        int len=str.length();
        int[] num = new int[len];

        for (int i = 0; i < len; i++) { //String을 한글자씩 숫자로 int배열에 넣기
            num[i]=str.charAt(i)-'0';
        }

        int maxIndex;
        int max;

        for (int i = 0; i < len-1; i++) {   //선택정렬
            maxIndex=0;     //최소값의 인덱스 저장
            max=-1;       //최소값 저장
            for (int j = i; j < len; j++) {
                if(max<num[j]){
                    max=num[j];
                    maxIndex=j;
                }
            }
            if(maxIndex!=i){        //현재 위치가 최소값이 아니라면 swap
                int temp=num[i];
                num[i] = num[maxIndex];
                num[maxIndex]=temp;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(num[i]);
        }
    }
}
