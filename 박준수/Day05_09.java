import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day05_09 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt((st.nextToken()));
        int result = 0;
       checkArr = new int[4]; // 문제 DNA 상태
       myArr = new int[4];     // 나의 DNA 상태
       checkSecret =0;          // 4가 되면 result++;
        char A[] = new char[S];     //DNA 문자
        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0){       // 0이면 DNA가 있어도 없어도 상관이 없어서 하나의 DNA는 만족할 수 있음
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) { //부분문자열 처음 받을떄 세팅
            Add(A[i]);                  // 처음 P만큼의 부분 문자열 확인
        }

        if(checkSecret == 4) result++;

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {   // i는 마지막 문자열 j는 처음 문자열
            int j = i-P;
            Add(A[i]);                  // 하나 늘려주면
            Remove(A[j]);               // 하나 빼준다
            if(checkSecret == 4) result++;
        }
        System.out.println(result);
        bf.close();

    }

    private static void Add(char c){
        switch (c){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static  void Remove(char c){
        switch (c){
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

}