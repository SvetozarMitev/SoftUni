import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int countSteps = 0;
        while (!command.equals("Going home")) {
            int currentSteps = Integer.parseInt(command);//командата ще е или Going home или число;
            countSteps += currentSteps;


            if (countSteps >= 10000) {
                break;

            }

            command = sc.nextLine();
        }
        if (command.equals("Going home")) {
            int homeSteps = Integer.parseInt(sc.nextLine());
            countSteps += homeSteps;
        }
        int overSteps = Math.abs(countSteps - 10000);
        if (countSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal! ", overSteps);

        } else {
            System.out.printf("%d more steps to reach goal.", overSteps);
        }
    }
}
