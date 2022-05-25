import java.util.Scanner;

public class E04Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        // числа от едно до n
        // повтарям: принтирам число + промяна
        //стоп : число > n
        //продължавам: число <= n



        int number = 1;
        while (number <= n) {
            System.out.println(number);// първо принтираме числото
            number = number * 2 + 1;// след това го умножаваме по 2 и събираме и така се върти цикъла,
        }                           // докато number <= n
        //решение с for:
        //начало: 1
        //край: n
        // промяна:предищното число * 2 + 1

        // for (int number = 1; number <= n ; number= number * 2 + 1) {

        //}

    }


}
