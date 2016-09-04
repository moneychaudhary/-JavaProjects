import java.util.Scanner;

/**
 * Created by money on 24/6/16.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        if (line.length() <= 100 && line.length() > 0) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) > 65 & line.charAt(i) < 90) {
                     char upperCase = Character.toUpperCase(line.charAt(i));

                    line.replace(line.charAt(i), upperCase);

                }
                else
            }        }
        System.out.println(line);
    }
}


