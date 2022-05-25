import java.util.Scanner;

public class E06Cake {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());// дължина на тортата
        int width = Integer.parseInt(sc.nextLine());// широчина

        int allPieces = length * width;


        String input = sc.nextLine();
        while (!input.equals("STOP")) {
            int takePieces = Integer.parseInt(input);
            allPieces = allPieces - takePieces;

            if (allPieces < 0) {
                break;
            }

            input = sc.nextLine();
        }
        if (allPieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        } else {
            System.out.printf("%d pieces are left.", allPieces);
        }
    }


}
