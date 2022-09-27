import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Day07_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PriorityQueue<Integer> Lowest = new PriorityQueue<>();
        PriorityQueue<Integer> Highest = new PriorityQueue<>(Collections.reverseOrder());
        int N=scanner.nextInt();
        int x,i,count=0;
        int[] ans=new int[N];
        for(i=0;i<N;i++){
            x=scanner.nextInt();
            if(x==0){
                if(Lowest.size()==0&&Highest.size()==0) ans[count++]=0;
                else if(Lowest.size()==0) ans[count++]=(Highest.poll());
                else if(Highest.size()==0)ans[count++]=(Lowest.poll());
                else{
                    if(Lowest.peek()==-Highest.peek())
                        ans[count++]=(Highest.poll());
                    else if(Lowest.peek()<-Highest.peek())
                        ans[count++]=(Lowest.poll());
                    else if(Lowest.peek()>-Highest.peek())
                        ans[count++]=(Highest.poll());
                }


            }
            else {
                if(x>0){
                    Lowest.add(x);
                }
                else{
                    Highest.add(x);
                }
            }
        }
        for(i=0;i<count;i++){
            System.out.println(ans[i]);
        }
    }
}