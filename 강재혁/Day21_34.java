import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Day21_34 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();   //카드 묶음의 수 저장하기
        int one=0,zero=0;
        //양수는 내림차순으로 정렬하기
        PriorityQueue<Integer> positive=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negative=new PriorityQueue<>();

        for(int i=0;i<N;i++){       //4개의 그룹으로 분리해 저장하기
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
        //양수 처리하기
        while (positive.size()>1){
            int data1=positive.remove();
            int data2=positive.remove();
            sum=sum+data1*data2;
        }
        if(!positive.isEmpty()){
            sum=sum+ positive.remove();
        }
        //음수 처리하기
        while (negative.size()>1){
            int data1=negative.remove();
            int data2=negative.remove();
            sum=sum+data1*data2;
        }
        if(!negative.isEmpty()&&zero==0){
            sum=sum+ negative.remove();
        }
        //1 처리하기
        sum=sum+one;

        System.out.print(sum);
    }
}