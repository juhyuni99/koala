//잃어버린 괄호 : https://www.acmicpc.net/problem/1541

import java.util.Scanner;
import java.util.StringTokenizer;

public class Day22_2 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String str= scan.next();
        int ans=0;
        String[] minusSplit=str.split("-");
        for(int i=0;i< minusSplit.length;i++){
            int tmp =plus(minusSplit[i]);
            if(i==0){
                ans=ans+tmp;
            }else{
                ans=ans-tmp;
            }
        }
        System.out.print(ans);
    }
    public static int plus(String minus){
        int temp=0;
        String tmp[]=minus.split("[+]");        //-와 달리 +는
        for(int i=0;i<tmp.length;i++){
            temp=temp+Integer.parseInt(tmp[i]);
        }
        return temp;
    }
}
