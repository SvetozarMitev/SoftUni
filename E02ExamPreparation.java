import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxLowGrades = Integer.parseInt(sc.nextLine());


        double sumGrades = 0;// сбор на оценките
        int countLowGrades = 0;
        String lastProblem = "";
        int countProblems = 0;// брой на задачите
        String input = sc.nextLine();// име на задача
        while (!input.equals("Enough")) {
            String problemName = input;
            int grade = Integer.parseInt(sc.nextLine());

            if (grade <= 4) {
                countLowGrades++;
            }
            if (countLowGrades >= maxLowGrades) {
                break;
            }
            countProblems++;
            sumGrades = sumGrades + grade;
            lastProblem = problemName;

            input = sc.nextLine();

        }
        if (countLowGrades >= maxLowGrades) {
            System.out.printf("You need a break, %d poor grades.", countLowGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }


}
