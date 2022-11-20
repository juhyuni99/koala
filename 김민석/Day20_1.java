import java.util.Scanner;

public class Day20_1 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N= scan.nextInt();
        int K= scan.nextInt();
        int ary[]=new int[N];
        for(int i=0;i<N;i++){
            ary[i]=scan.nextInt();
        }
        int result=0;
        while(K!=0){
            result=result+K/ary[N-1];
            K=K%ary[N-1];
            N=N-1;
        }
        System.out.print(result);
    }
}
