import java.util.Arrays;
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int NAry[]=new int[N];
        for(int i=0;i<N;i++){
            NAry[i]=scan.nextInt();
        }
        Arrays.sort(NAry);
        int M=scan.nextInt();
        for(int i=0 ;i<M;i++){
            boolean check=false;
            int target=scan.nextInt();
            int start=0;
            int end= NAry.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                int midV=NAry[mid];
                if(target>midV){
                    start=mid+1;
                }else if(target<midV){
                    end=mid-1;
                }else{
                    check =true;
                    break;
                }
            }
            if(check==true) System.out.println(1);
            if(check==false) System.out.println(0);
        }
    }
}
