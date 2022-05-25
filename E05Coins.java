import java.util.Scanner;

public class E05Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double change = Double.parseDouble(sc.nextLine());

        double coins = change * 100;

        double count = 0;

        while (coins > 0) {

            if (coins >= 200) {
                coins = coins - 200;
                count++;
            } else if (coins >= 100) {
                coins = coins - 100;
                count++;
            } else if (coins >= 50) {
                coins = coins - 50;
                count++;
            } else if (coins >= 20) {
                coins = coins - 20;
                count++;
            } else if (coins >= 10) {
                coins = coins - 10;
                count++;
            } else if (coins >= 5) {
                coins = coins - 5;
                count++;
            } else if (coins >= 2) {
                coins = coins - 2;
                count++;
            } else if (coins >= 1) {
                coins = coins - 1;
                count++;
            } else {
                break;
            }

        }
        System.out.printf("%.0f", count);
    }


}
