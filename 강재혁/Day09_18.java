import java.io.IOException;
import java.util.Scanner;

public class Day09_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]= sc.nextInt();
        }
        int sum=0;  //총 걸린 시간
        int minIndex;
        int min;

        for (int i = 0; i < n-1; i++) {     //선택정렬
            minIndex=0;     //최소값의 인덱스 저장
            min=1000;       //최소값 저장
            for (int j = i; j < n; j++) {
                if(min>num[j]){
                    min=num[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){        //현재 위치가 최소값이 아니라면 swap
                int temp=num[i];
                num[i] = num[minIndex];
                num[minIndex]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {  //걸린 시간 계산
                sum=sum+num[j];
            }
        }
        System.out.println(sum);
    }
}
