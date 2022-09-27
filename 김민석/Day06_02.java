import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Day06_02 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(buf.readLine());
        int []numAry=new int[n];
        int []answer=new int[n];
        Stack<Integer> stack=new Stack<>();
        String[] str= buf.readLine().split(" ");
        for(int i=0;i<n;i++){
            numAry[i]=Integer.parseInt(str[i]);
        }
        stack.push(0);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&numAry[stack.peek()]<numAry[i]){
                answer[stack.pop()]=numAry[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            answer[stack.pop()]=-1;
        }
        BufferedWriter bu=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bu.write(answer[i]+" ");
        }
        bu.write("\n");
        bu.flush();

    }
}