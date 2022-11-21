import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Day21 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int one=0,zero=0;
        PriorityQueue<Integer> positive=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negative=new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int data=scan.nextInt();
            if(data>1){
                positive.add(data);
            }else if(data==1){
                one++;
            }else if(data==0){
                zero++;
            }else{
                negative.add(data);
            }
        }
        int sum=0;
        while (positive.size()>1){
            int data1=positive.remove();
            int data2=positive.remove();
            sum=sum+data1*data2;
        }
        if(!positive.isEmpty()){
            sum=sum+ positive.remove();
        }
        while (negative.size()>1){
            int data1=negative.remove();
            int data2=negative.remove();
            sum=sum+data1*data2;
        }
        if(!negative.isEmpty()&&zero==0){
            sum=sum+ negative.remove();
        }
        sum=sum+one;

        System.out.print(sum);
    }
}
