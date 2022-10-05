import java.io.*;

//public class Day12_01 {
//        public static int[] A;
//        public static long result;
//        public static void main(String[] args) throws IOException {
//                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//                int N=Integer.parseInt(br.readLine());
//                A=new int[N];
//                for(int i=0;i<N;i++){
//                        A[i]=Integer.parseInt(br.readLine());
//                }
//                br.close();
//                Radix_Sort(A,5);
//                for(int i=0;i<N;i++){
//                        bw.write(A[i]+"\n");
//                }
//                bw.flush();
//                bw.close();
//        }
//
//        public static void Radix_Sort(int[] A,int max_size){
//                int[] output=new int[A.length];
//                Queue<Integer>[] bucket = new LinkedList[10];
//                for (int i = 0; i < 10; ++i) {
//                        bucket[i] = new LinkedList<>();
//                }
//                int factor=1;
//                for(int k=0;k<max_size;k++){
//                        for(int i=0;i<A.length;i++){
//                                bucket[A[i]/factor%10].add(A[i]);
//                        }
//                        for (int i = 0, j = 0; i < 10; ++i) {
//                                while (!bucket[i].isEmpty()) {
//                                        A[j++] = bucket[i].poll();
//                                }
//                        }
//                        factor=factor*10;
//                }
//
//
//        }
//}

public class Day12_01 {
    public static int[] A;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Radix_Sort(A, 5);
        for (int i = 0; i < N; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void Radix_Sort(int[] A, int max_size) {
        int[] output = new int[A.length];
        int jarisu = 1;
        int count = 0;
        while (count != max_size) {
            int[] bucket = new int[10];
            for (int i = 0; i < A.length; i++) {
                bucket[(A[i] / jarisu) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = A.length - 1; i >= 0; i--) {
                output[bucket[(A[i] / jarisu % 10)] - 1] = A[i];
                bucket[(A[i] / jarisu) % 10]--;
            }
            for (int i = 0; i < A.length; i++) {
                A[i] = output[i];
            }
            jarisu = jarisu * 10;
            count++;
        }
    }
}