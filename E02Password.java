import java.util.Scanner;

public class E02Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //повтаряме -> въвеждане парола
        //спираме ->  въведената парола == pass
        //продължаваме -> въведената парола (input) != pass
        String name = sc.nextLine();
        String pass = sc.nextLine();

        String input = sc.nextLine();

        while (!input.equals(pass)) {
            input = sc.nextLine();
        }


        System.out.printf("Welcome %s!", name);
    }


}
