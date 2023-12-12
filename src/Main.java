import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

            String inputLine = br.readLine();
            StringTokenizer st = new StringTokenizer(inputLine, " ");

            int n = Integer.parseInt(st.nextToken());

            int[] array = new int[n];
            int x = Integer.parseInt(st.nextToken());

            String ar = br.readLine();
            st = new StringTokenizer(ar, " ");

            for (int i = 0; i < n; i++) {
                if (st.hasMoreTokens()) {
                    array[i] = Integer.parseInt(st.nextToken());
                }
            }

            String result = "";

            for (int i = 0; i < array.length; i++) {
                if (array[i] < x) {
                    result += String.valueOf(array[i] + " ");
                }
            }

            bw.write(result);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}