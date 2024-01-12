import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;
import sun.util.BuddhistCalendar;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
/*
        // 스캐너 사용 자작
        Scanner in = new Scanner(System.in);

        int N = 9;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int compIdx = arr[i];
            if(i == 0) {
                max = compIdx;
                maxIndex = i;
                continue;
            }
            if(compIdx > max) {
                max = compIdx;
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
 */

/*
        // 방법 1 - 스캐너
        Scanner in = new Scanner(System.in);
        int[] arr = {
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
        };
        in.close();

        int count = 0;
        int max = 0;
        int index = 0;

        for(int value : arr) {
            count++;

            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max + "\n" + index);
 */

/*
        // 방법 1-2 - 스캐너 + Collections 사용
        Scanner in = new Scanner(System.in);
        List<Integer> list = Arrays.asList(
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt()
        );
        in.close();

        int val = Collections.max(list);
        int idx = list.indexOf(val) + 1;

        System.out.println(val);
        System.out.println(idx);
*/

/*
        // 방법 2 - 버퍼리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
*/

        // 방법 33 - 배열X
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++) {
            int val = Integer.parseInt(br.readLine());

            if(val > max) {
                max = val;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);

    }
}