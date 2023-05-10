import java.util.Scanner;

public class CYOAObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to the game! Choose option 1, 2, 3, 4, or 5.");

            String choice = scanner.next();

            if (choice.equals("1")) {
                System.out.println("You chose option 1.");
            } else if (choice.equals("2")) {
                System.out.println("You chose option 2.");
            } else if (choice.equals("3")) {
                System.out.println("You chose option 3.");
            } else if (choice.equals("4")) {
                System.out.println("You chose option 4.");
            } else if (choice.equals("5")) {
                System.out.println("You chose option 5.");
                String choice2 = scanner.next();
                if (choice2.equals("1")) {
                    System.out.println("You chose option 5.1.");
                } else if (choice2.equals("2")) {
                    System.out.println("You chose option 5.2.");
                } else if (choice2.equals("3")) {
                    System.out.println("You chose option 5.3.");
                } else if (choice2.equals("4")) {
                    System.out.println("You chose option 5.4.");
                } else if (choice2.equals("5")) {
                    System.out.println("You chose option 5.5.");
                } else {
                    System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to play again? (Y/N)");
            String playAgainChoice = scanner.next();
            if (!playAgainChoice.equalsIgnoreCase("Y")) {
                playAgain = false;
            }
        }
    }
}
