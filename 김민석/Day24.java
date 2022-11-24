import java.util.Scanner;

public class Day24 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int[] num=new int[10000000];
        for(int i=2;i<10000000;i++){
            num[i]=i;
        }
        for(int i=2;i<Math.sqrt(num.length);i++){       //N까지 수 중에서 소수들만 뽑아냄
            if(num[i]==0){
                continue;
            }
            for(int j=i+i;j<num.length;j=j+i){
                num[j]=0;
            }
        }
        for(int i=n;i<=10000000;i++){
            if(num[i]!=0){
                if(check(num[i])){
                    System.out.println(num[i]);
                    return;
                }
            }
        }

    }
    public static boolean check(int num){
        String tmp=String.valueOf(num);
        char[] numAry=tmp.toCharArray();
        for(int i=0;i<numAry.length/2;i++){
            if(numAry[i]!=numAry[numAry.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
