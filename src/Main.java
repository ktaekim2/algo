import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;
import sun.util.BuddhistCalendar;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 배열X
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val > max) {
                max = val;
            }
            if(val < min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);

/*
        // 버퍼리더 sort 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
*/

/*
        // 스캐너 사용
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]  );
*/

/*
        // 버퍼리더 자작
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

            String inputLine = br.readLine();
            StringTokenizer st = new StringTokenizer(inputLine, " ");

            int n = Integer.parseInt(st.nextToken());

            int[] array = new int[n];

            String ar = br.readLine();
            st = new StringTokenizer(ar, " ");

            for (int i = 0; i < n; i++) {
                if (st.hasMoreTokens()) {
                    array[i] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            int min = 0;

            for (int i = 0; i < array.length; i++) {
                int compIdx = array[i];
                if(i == 0) {
                    max = compIdx;
                    min = compIdx;
                    continue;
                }
                if(compIdx > max) {
                    max = compIdx;
                }

                if(compIdx < min) {
                    min = compIdx;
                }
            }

            String result = "";

            result = min + " " + max;

            bw.write(result);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/


    }
}