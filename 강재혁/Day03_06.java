import java.util.Scanner;

public class Day03_06 {
    public static void main(String[] args) {
        int start=1;    //연속된 정수 합의 시작점
        int end=1;      //연속된 정수 합의 종료점
        int sum=1;      //연속된 정수의 합
        int N,count=0;
        Scanner scanner = new Scanner(System.in);

        N= scanner.nextInt();

        while (start <= end) {
            if(sum==N)count++;  //값이 같으면 count++
            if(sum<N){
                sum+=++end;
            } else{
                sum-=start;
                start++;
            }
        }

        System.out.println(count);
    }
}
