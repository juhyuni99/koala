import java.util.Scanner;

public class Day19_31 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int K=scan.nextInt();
        long start=0,end=K;
        int count=0;
        long answer=0;

        while(start<=end){
            long mid=(start+end)/2;
            count=0;
            for(int i=1;i<=N;i++){
                count+=Math.min(mid/i,N);
            }
            if(count<K){
                start=mid+1;
            }else{
                answer=mid;
                end=mid-1;
            }
        }
        System.out.print(answer);

    }
}
/*
  1 2 3 4 5
1 1 2 3 4 5
2 2 4 6 8 10
3 3 6 9 12 15
4 4 8 12 16 20
5 5 10 15 20 25
*/

