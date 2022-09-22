import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Day03_05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int Array[] = new int [N+1];
		long result = 0;
		long []cnt = new long[M];		// 같은 나머지의 인덱스를 카운트하는 배열
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 1; i < N+1; i++) {
			Array[i] = (Array[i-1] + Integer.parseInt(st.nextToken())) % M;
			
			if(Array[i] == 0) {	// 0~1까지의 합을 M으로 나눈 나머지가 0인 경우의 수 카운팅
				result++;
			}
			cnt[(int) Array[i]]++;
		}
		
		for(int i = 0; i < M; i++) {
			if(cnt[i] > 1) {
				result += (cnt[i] * (cnt[i]-1)/2);
			}
		}
		bw.write(result + "\n");
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음
	}

}
