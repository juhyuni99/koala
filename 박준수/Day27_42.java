import java.util.Scanner;

public class Day27_42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println(gcd(num1, num2));
        }
    }

    public static int gcd(int num1, int num2){
        if(num1 % num2 == 0){
            return num2;
        }
        return gcd(num2, num1%num2);
    }
}


// 두 수의 곱 = 최소 공배수 * 최대 공약수