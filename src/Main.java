import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(bufferedReader.readLine());

            String star = "*";
            String blank = "";
            for (int i = 1; i <= a; i++) {
                for (int j = 0; j < a - i; j++) {
                    blank += " ";
                }
                System.out.println(blank + star);
                star += "*";
                blank = "";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}