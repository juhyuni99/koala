import java.util.Scanner;

/*
    문제 : https://www.acmicpc.net/problem/2343
*/

public class Day18 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int Ary[]=new int[N];


        int start=0;
        int end=0;
        for(int i=0;i<N;i++){
            Ary[i]=scan.nextInt();
            if(start<Ary[i]) start=Ary[i];
            end=end+Ary[i];
        }
        while(start<=end){
            int mid=(start+end)/2;
            int sum=0;
            int count=0;
            for(int i=0;i<N;i++){
                if(sum+Ary[i]>mid){
                    count++;
                    sum=0;
                }
                sum=sum+Ary[i];
            }
            if(sum!=0){
                count++;
            }
            if(count>M){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.print(start);

    }

}
