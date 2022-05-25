import java.util.Scanner;

public class E06MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String input = sc.nextLine();// число под формата на текст или "Stop"
          // повтарям: дали всяко въвеено число е максимум
         // спирам: когато въведения ред ми е "Stop"
         //продължава: въведения ред не ми е "Stop"
        while (!input.equals("Stop")) {
            //input число под формата на текст -> "4"
            //число под формата на текст -> цяло число
            int num = Integer.parseInt(input);// Парсване-> преобразуваме текст в число

            if (num > max) {
                max = num;
            }
            input = sc.nextLine();// така намаляваме шанса да се получи безкраен цикъл, ако не условието винаги
                                  // ще е true (ако го няма все едно не правим промяна)


        }
        System.out.println(max);


    }


}
