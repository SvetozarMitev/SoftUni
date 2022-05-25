import java.util.Scanner;

public class E07MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        String input = sc.nextLine();

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);

            if (num < min) {
                min = num;
            }
            input = sc.nextLine();
        }
        System.out.println(min);

    }


}
