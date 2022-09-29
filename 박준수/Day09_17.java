import java.util.*;

public class Day09_17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }
}