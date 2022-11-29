import java.util.Scanner;

public class Day27_1 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            int A =scan.nextInt();
            int B =scan.nextInt();
            System.out.println((A*B)/gcd(A,B));
        }
    }
    public static int gcd(int num1,int num2){
        int tmp;
        if(num2>num1){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }
        while(num1%num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num2;

    }
}
