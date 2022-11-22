import java.util.Scanner;

public class Day22_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String logic = scan.next();
        int result = 0;
        String[] spl = logic.split("-");

        for (int i = 0; i < spl.length; i++) {
            if (i == 0){
                result += mySum(spl[0]);
            }else{
                result -= mySum(spl[i]);
            }
        }
        System.out.println(result);

    }

    public static int mySum(String example){
        int sum = 0;
        String[] spl = example.split("[+]");
        for (int i = 0; i < spl.length; i++) {
            sum += Integer.parseInt(spl[i]);
        }
        return sum;
    }
}

//더하기에 해당하는 부분에 괄호를 쳐서 모두 계산한 후 빼기를 실행하면 된다.
// 먼저 "-"문자로 나누고// 나뉜 문자열을"+" 문자열로 나누어 다 더한다음에 빼면된다.