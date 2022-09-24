import java.util.Scanner;
import java.util.Arrays;

public class Day05_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,ans=0;
        int input_s=scanner.nextInt();      //s값 입력받기
        int input_p=scanner.nextInt();      //p값 입력받기
        final int check_number=input_s-input_p;
        String dna=scanner.next();          //임의의 문자열 Stirng 타입으로 입력받아서
        char[] dna_ary=dna.toCharArray();      //String 타입으로 입력받은 문자열 배열에 집어넣음
        int[] min_count=new int[4];     //최소 개수 저장할 배열
        int[] ans_check=new int[4];     //조건 맞는지 카운트
        for(i=0;i<min_count.length;i++){
            min_count[i]=scanner.nextInt();
        }       //최소 개수 차례대로 입력받음
        for(i=0;i<input_p;i++){
            if(dna_ary[i]=='A') ans_check[0]++;
            else if(dna_ary[i]=='C') ans_check[1]++;
            else if(dna_ary[i]=='G') ans_check[2]++;
            else if(dna_ary[i]=='T') ans_check[3]++;
        }
        if(ans_check[0]>=min_count[0]&&ans_check[1]>=min_count[1]&&ans_check[2]>=min_count[2]&&ans_check[3]>=min_count[3]){
            ans++;
        }
        for(i=0;i<check_number;i++){
            if(dna_ary[i]=='A') ans_check[0]--;
            else if(dna_ary[i]=='C') ans_check[1]--;
            else if(dna_ary[i]=='G') ans_check[2]--;
            else if(dna_ary[i]=='T') ans_check[3]--;
            if(dna_ary[i+input_p]=='A') ans_check[0]++;
            else if(dna_ary[i+input_p]=='C') ans_check[1]++;
            else if(dna_ary[i+input_p]=='G') ans_check[2]++;
            else if(dna_ary[i+input_p]=='T') ans_check[3]++;
            if(ans_check[0]>=min_count[0]&&ans_check[1]>=min_count[1]&&ans_check[2]>=min_count[2]&&ans_check[3]>=min_count[3]){
                ans++;
            }
        }
        System.out.print(ans);
    }
}