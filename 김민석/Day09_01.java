import java.util.Scanner;

public class Day09_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input = scanner.nextInt();
        int numCount=0;
        int i,max,temp;
        int numAry[]=new int[10];
        while(input/10!=0){
            numAry[numCount++]=input%10;
            input=input/10;
        }
        numAry[numCount++]=input%10;
        for(i=0;i<numCount-1;i++){
            max=i;
            for(int j=i;j<numCount;j++){
                if(numAry[max]<numAry[j]){
                    max=j;
                }
            }
            temp=numAry[i];
            numAry[i]=numAry[max];
            numAry[max]=temp;
        }
        for(i=0;i<numCount;i++){
            System.out.print(numAry[i]);
        }
    }
}