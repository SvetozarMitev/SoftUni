import java.util.Scanner;

public class E08Graduation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        double sumAllGrades = 0;
        int countClasses = 0;
        int countLowGrades = 0;

        while (countClasses != 12) {
            double currentGrade = Double.parseDouble(sc.nextLine());

            if (currentGrade < 4) {
                countLowGrades++;
                if (countLowGrades > 1) {
                    break;
                }
            }
            sumAllGrades = sumAllGrades + currentGrade;
            countClasses++;


        }
        if (countClasses == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumAllGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, countClasses);
        }
    }


}
