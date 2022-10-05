import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day12_22 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int value : arr){
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }

    //Array 와 ArrayList 차이
    // Array는 초기화시 메모리에 할당되어 ArrayList보다 속도가 빠르다
    // ArrayList는 데이터 추가 삭제시 메모리를 재할당하기 때문에 속도가 Array보다 느리다.
    // ArrayList는 Default 저장용량은 10이다.
    // ArrayList의 capacity가 배열의 길이와 같아지면 일반적으로 기존의 용량 + 기존 용량/만큼 크기가 늘어난 배열에 기존의 배열을 Copy한다.
    // 그래서 ArrayList로 문제를 풀때는 메모리 초과가 나왔다.
    // Arrays.sort 와 Collections.sort는 다른 정렬 기법을 사용한다.
    // Arrays.sort는 평균 O(nlong(n) 최악 O(n^2)
    // Collections.sort는 평균 최악  O(nlong(n)


}
