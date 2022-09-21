import java.util.Scanner;
public class Day03_02 {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int i,j,n,sum=0, count=0;
        n=scanner.nextInt();
        for(i=1;i<=n;i++){
            sum=0;
            for(j=i;sum<=n;j++){
                sum+=j;
                if(sum==n){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}