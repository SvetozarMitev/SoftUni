import java.util.Scanner;

public class E05AccountBalance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // повтаряме : въвеждане на входни данни
        //стоп: въведения ред е "No more Money"
        //продължавам; въведения ред не е  "No more Money"


        double allMoney = 0;// пари в сметката
        String input = sc.nextLine(); // "No more Money" или дробни числа под формата на текст

        while (!input.equals("NoMoreMoney")) {
            double deposit = Double.parseDouble(input);

            if (deposit < 0) { // проверка дали сумата е < 0 -> печатам + break
                System.out.println("Invalid operation!");
                break;
            } else { // проверка дали сумата е >= 0 печатам + добавяне към сметка
                System.out.printf("Increase: %.2f%n", deposit);
                allMoney += deposit;
            }
            input = sc.nextLine();
        }
        System.out.printf("Total: %.2f" , allMoney);
    }


}
