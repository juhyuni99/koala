import java.util.Scanner;

public class Day23_38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long M = scan.nextInt();
        long N = scan.nextInt();
        long[] prime = new long[10000001];

        for (int i = 2; i < prime.length ; i++) {
            prime[i] = i;
        }
        for (int i = 2; i <=Math.sqrt(prime.length); i++) {
            if(prime[i] == 0){
                continue;
            }
            for (int j = i+i; j <prime.length ; j= j+i) {
                prime[j] = 0;
            }
        }
        int count = 0;
        for (int i = 2; i < 10000001 ; i++) {
            if (prime[i] != 0) {
                long temp = prime[i];
                while ((double)prime[i] <= (double)N/(double)temp){
                    if((double)prime[i] >= (double)M/(double)temp){
                        count++;
                    }
                    temp = temp * prime[i];
                }
            }
        }
        System.out.println(count);
    }
}
