import java.util.Scanner;

public class Day09_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int numAry[]=new int[N];
        int sumAry[]=new int[N+1];
        int i,j,temp,min,ans=0;
        for(i=0;i<N;i++){
            numAry[i]= scanner.nextInt();
        }
        for(i=0;i<N-1;i++){
            min=i;
            for(j=i;j<N;j++){
                if(numAry[min]>numAry[j]){
                    min=j;
                }
            }
            temp=numAry[i];
            numAry[i]=numAry[min];
            numAry[min]=temp;
            sumAry[i+1]=sumAry[i]+numAry[i];
        }
        sumAry[N]=sumAry[N-1]+numAry[i];
        for(i=1;i<=N;i++){
            ans=ans+sumAry[i];
        }
        System.out.print(ans);
    }
}