import java.util.Scanner;
public class Day03_01 {
    static Scanner scanner=new Scanner(System.in);
    static int input(){     //N과 M을 입력받기 위한 함수
        int temp=scanner.nextInt();
        return temp;
    }

    public static void main(String[] args) {
        int n,m,i,j, count=0;
        n=input();      //N의 값 입력받아서 n에 저장
        m=input();      //M의 값 입력받아서 m에 저장
        int modArray[]=new int[m+1];
        for(i=0;i<n;i++){
            count=(count+scanner.nextInt())%m;
            modArray[count]++;        //구간의 합을 m의 값으로 나눠주고 배열에 숫자를 세준다
        }

        long sum=modArray[0];
        for(i=0;i<m;i++){
            sum+=(long) modArray[i]*(modArray[i]-1)/2;      //nC2 조합을 이용하여 구한다.
        }
        System.out.println(sum);
    }
}