import java.util.Scanner;
import java.util.Arrays;

public class Day04_01 {

    public static void main(String[] args) {
        int i;
        int start=0,end=0;
        int ans=0;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        end=n;
        int numAry[]=new int[n+1];
        for(i=0;i<n;i++){
            numAry[i]=scanner.nextInt(); //n개의 숫자 배열에 저장
        }
        Arrays.sort(numAry);
        while(start<end){
            while(numAry[++start]+numAry[end]<=m&&start<end){
                if(numAry[start]+numAry[end]>=m){
                    if(numAry[start]+numAry[end]==m) ans++;
                    break;
                }
            }
            while(numAry[start]+numAry[--end]>=m&&start<end){
                if(numAry[start]+numAry[end]<=m){
                    if(numAry[start]+numAry[end]==m) ans++;
                    break;
                }
            }
        }
        System.out.println(ans);


    }
}