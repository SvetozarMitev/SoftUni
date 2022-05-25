import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wantedBook = sc.nextLine();

        int countBooks = 0;
        boolean wasFound = false;
        String input = sc.nextLine();

        while (!input.equals("No More Books")) {
            String currentBook = input;

            if (currentBook.equals(wantedBook)) {
                wasFound = true;
                break;

            }
            countBooks++;



            input = sc.nextLine();


        }

        if (wasFound) {
            System.out.printf("You checked %d books and found it.", countBooks);

        } else  {
            System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
        }


    }


}
