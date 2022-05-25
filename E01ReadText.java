import java.util.Scanner;

public class E01ReadText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // действието което се повтаря -> получаване на текст и отпечатването му
        // спираме когато текста е "Stop"
        // продължаваме докато текста е различен от "Stop"
        String input = sc.nextLine();

        while (!input.equals("Stop")) {
            System.out.println(input);
            input = sc.nextLine();
        }
        //решение с for:
        for (String input1 = sc.nextLine(); !input1.equals("Stop"); input1 = sc.nextLine()) {

        }

    }


}
