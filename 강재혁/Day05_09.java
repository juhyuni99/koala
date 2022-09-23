import java.util.Scanner;

public class Day05_09 {
    public static void main(String[] args) {
        int S,P;
        String str;
        char []DNA={'A','C','G','T'};
        int[] DNA_num = new int[4];     //포함되어야 할 문자의 갯수
        int []DNANumberCheck=new int[4];    //포함된 문자의 갯수
        char []check;
        int count=0;

        Scanner sc = new Scanner(System.in);

        S= sc.nextInt();
        P= sc.nextInt();
        check = new char[P];

        str=sc.next();
        char[] num = str.toCharArray();

        for (int i = 0; i < 4; i++) {       //포함되어야 할 문자의 갯수
            DNA_num[i] = sc.nextInt();
        }
        for (int i = 0; i < P; i++) {       //비밀번호 저장
            check[i]=num[i];
        }

        for (int i = 0; i < P; i++) {       //첫 비밀번호 확인
            for (int j = 0; j < 4; j++) {
                if(check[i]==DNA[j]){
                    DNANumberCheck[j]++;
                }
            }
        }
        // 염기서열 조건 충족했는지 확인
        if(DNANumberCheck[0]>=DNA_num[0] && DNANumberCheck[1]>=DNA_num[1] && DNANumberCheck[2]>=DNA_num[2] && DNANumberCheck[3]>=DNA_num[3]){
            count++;
        }


        for (int i=P;i<S;i++){

            if(num[i-P]==DNA[0]){       //맨 앞의 염기서열에 해당되는 숫자 -1
                DNANumberCheck[0]--;
            } else if (num[i-P]==DNA[1]) {
                DNANumberCheck[1]--;
            } else if (num[i-P]==DNA[2]) {
                DNANumberCheck[2]--;
            } else if (num[i-P]==DNA[3]) {
                DNANumberCheck[3]--;
            }

            if(num[i]==DNA[0]){        //추가될 염기서열에 해당되는 숫자 +1
                DNANumberCheck[0]++;
            } else if (num[i]==DNA[1]) {
                DNANumberCheck[1]++;
            } else if (num[i]==DNA[2]) {
                DNANumberCheck[2]++;
            } else if (num[i]==DNA[3]) {
                DNANumberCheck[3]++;
            }

            // 염기서열 조건 충족했는지 확인
            if(DNANumberCheck[0]>=DNA_num[0] && DNANumberCheck[1]>=DNA_num[1] && DNANumberCheck[2]>=DNA_num[2] && DNANumberCheck[3]>=DNA_num[3]){
                count++;
            }
        }

        System.out.print(count);
    }


}
