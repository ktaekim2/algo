import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
/*        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n);
        for(int i = 0 ; i <= n ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + i + ": " + (a+b));
        }
        scanner.close();*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;

        for (int i = 1; i <= a; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            System.out.println("Case #" + i + ": " + (Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken())));
        }

        bufferedReader.close();

    }
}