import java.util.Scanner;

public class Day08_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,j;
        int temp=0;
        int N= scanner.nextInt();
        int numAry[]=new int[N];
        for(i=0;i<N;i++){
            numAry[i]=scanner.nextInt();
        }
        for(i=N-1;i>0;i--){
            for(j=0;j<i;j++){
                if(numAry[j]>numAry[j+1]){
                   temp=numAry[j];
                   numAry[j]=numAry[j+1];
                   numAry[j+1]=temp;
                }
            }
        }
        for(i=0;i<numAry.length;i++){
            System.out.println(numAry[i]);
        }
    }
}