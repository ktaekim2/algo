import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        String inputLine = br.readLine();
        StringTokenizer st = new StringTokenizer(inputLine, " ");

        for (int i = 0; i < n; i++) {
            if(st.hasMoreTokens()) {
                array[i] = Integer.parseInt(st.nextToken());
            }
        }

        int c = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == c) {
                count++;
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
}