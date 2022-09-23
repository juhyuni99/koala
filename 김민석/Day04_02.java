import java.util.Scanner;
import java.util.Arrays;

public class Day04_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n<1||n>2000) System.exit(0);
        int i;
        int ans=0;
        long sum=0;
        int start=0, end=n;
        long numAry[]=new long[n];
        for(i=0;i<n;i++){
            numAry[i]=scanner.nextLong();
        }
        Arrays.sort(numAry);
        for(i = 0; i<n; i++) {

            start = 0;
            end = n-1;
            sum = 0;


            while(start < end){
                sum = numAry[start] + numAry[end];
                if(sum == numAry[i]){
                    if(i == start)
                        start++;
                    else if(end == i)
                        end--;
                    else{
                        ans++;
                        break;
                    }
                }

                if(numAry[start] + numAry[end] > numAry[i])
                    end--;
                else if(numAry[start] + numAry[end] < numAry[i])
                    start++;

            }
        }
        System.out.print(ans);
    }
}
