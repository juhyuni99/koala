import java.util.Scanner;

public class Day26_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); //소인수 구성 (범위가 10^12까지 이므로 long 타입으로 선언)
        long result = n;    //서로소의 개수
        for (int i = 2; i <= Math.sqrt(n); i++) {   //n의 제곱근까지 반복
            if (n % i == 0) {
                result = result - (result / i);     //n보다 작은 값중에 i의 배수의 개수만큼 제거
                while ((n % i) == 0) {  //소인수 구성에서 i를 뺌
                    n = n / i;
                }
            }
        }
        if (n > 1) {    //반복문 종료 후 n이 1보다 크면 n이 마지막 소인수라는 의미이므로 빼줌
            result = result - (result / n);
        }
        System.out.println(result);
        sc.close();
    }
}
