import java.io.*;
public class Day03_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0, end = 0; // 튜포인터 설정
		
		int sum = 0, count = 0; // sum : 합 , count : 가지수 (정답)
		
		while(start <= N) { //start인덱스가 숫자 전까지 반복
			while(++end <= N) {	//end증가 -> 부분합이 증가
				sum += end;
				if(sum >= N) {
					if(sum == N) count++;
					break;
				}
			}
			while(++start <= N) {	//start증가 -> 부분합이 감소
				sum -= start;
				if(sum <= N) {
					if(sum == N) count++;
					break;
				}
			}
	}
	System.out.println(count);

}
}
