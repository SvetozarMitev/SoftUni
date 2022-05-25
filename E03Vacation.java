import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double neededMoney = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());


        int spendingCounter = 0;
        int daysCounter = 0;
        while (availableMoney < neededMoney && spendingCounter < 5) {
            String action = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());
            daysCounter++;

            if (action.equals("save")) {
                availableMoney += money;
                spendingCounter = 0;

            } else if (action.equals("spend")) {
                availableMoney -= money;
                spendingCounter += 1;

                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }


        }

        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }


    }


}
