import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(bufferedReader.readLine());

            String star = "*";
            for (int i = 1; i <= a; i++) {
                System.out.println(star);
                star += "*";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}