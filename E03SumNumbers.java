import java.util.Scanner;

public class E03SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
         // повтаряме: прочитам число и събиране
        //спиране: когато sum >= number
        // продължавам: докато sum < number -> условите при което продължаваме е условиет на while цикъла


        int sum = 0;// тук добавяме прочетените числа


        while (sum < number) {
            int inputNumbers = Integer.parseInt(sc.nextLine());
            sum = sum + inputNumbers;
        }
        System.out.println(sum); // принтирането е извън цикъла, защото по условие: след приключване на четенето
    }                            // да се отпечата


}
