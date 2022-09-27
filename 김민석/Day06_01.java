import java.util.Scanner;
import java.util.Stack;

public class Day06_01 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        StringBuffer ans=new StringBuffer();
        boolean result= true;
        int input_n= scanner.nextInt();
        int i,temp,cur_num=1;
        int numAry[]=new int[input_n];
        for(i=0;i<input_n;i++){
            numAry[i]= scanner.nextInt();
        }
        for(i=0;i<input_n;i++){
            temp=numAry[i];
            if(temp>=cur_num){
                while(temp>=cur_num){
                    stack.push(cur_num++);
                    ans.append("+\n");
                }
                stack.pop();
                ans.append("-\n");

            }
            else{
                int n=stack.pop();
                if(n>temp){
                    System.out.print("NO");
                    result=false;
                    break;
                }
                else{
                    ans.append("-\n");
                }
            }
        }
        if(result) System.out.print(ans.toString());
    }
}