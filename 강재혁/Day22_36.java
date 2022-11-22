import java.util.Scanner;

public class Day22_36 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String str= scan.next();
        int ans=0;
        String[] minusSplit=str.split("-");

        for(int i=0;i< minusSplit.length;i++){
            int tmp =plus(minusSplit[i]);
            if(i==0){
                ans=ans+tmp;        //가장 앞에 있는 값만 더함
            }else{
                ans=ans-tmp;        //뒷부분은 더한 값들을 뺌
            }
        }

        System.out.print(ans);
    }
    public static int plus(String minus){   //나눈 그룹의 더하기 연산 수행
        int temp=0;
        String tmp[]=minus.split("[+]");        //-와 달리 +는 []를 해줘야 함
        for(int i=0;i<tmp.length;i++){
            temp=temp+Integer.parseInt(tmp[i]);
        }
        return temp;
    }
}
