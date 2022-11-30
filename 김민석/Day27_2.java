import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day27_2 {
    public static void main(String[] args) throws IOException {
        Scanner scan =new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        long A= scan.nextLong();
        long B= scan.nextLong();
        long result=gcd(A,B);
        while(result>0){
            bw.write("1");
            result--;
        }
        bw.flush();
        bw.close();
    }
    public static long gcd(long num1,long num2){
        if(num2==0)
            return num1;
        else
            return gcd(num2,num1%num2);
    }
}
