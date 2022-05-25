import java.util.Scanner;

public class E07Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int allSpace = width * length * height;

        String input = sc.nextLine();
        while (!input.equals("Done")) {
            int currentBox = Integer.parseInt(input);

            allSpace = allSpace - currentBox;
            if (allSpace <= 0) {
                break;
            }
            input = sc.nextLine();
        }

        if (allSpace <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(allSpace));

        } else {
            System.out.printf("%d Cubic meters left.", allSpace);
        }


    }


}
