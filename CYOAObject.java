import java.util.Scanner;

public class CYOAObject {
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to the Choose Your Own Adventure Game!");
        
        boolean playAgain = true;
        
        while (playAgain) {
            System.out.println();
            System.out.println("Do you want to choose option 1, 2, 3, 4, or 5?");
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
                
                System.out.println("Do you want to choose option 1, 2, 3, 4, or 5?");
                String choice2 = scanner.next();
                
                if (choice2.equals("1")) {
                    System.out.println("You chose option 1.");
                } else if (choice2.equals("2")) {
                    System.out.println("You chose option 2.");
                } else if (choice2.equals("3")) {
                    System.out.println("You chose option 3.");
                } else if (choice2.equals("4")) {
                    System.out.println("You chose option 4.");
                } else if (choice2.equals("5")) {
                    System.out.println("You chose option 5.");
                } else {
                    System.out.println("Invalid input. Please enter 1, 2, 3, 4, or 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter 1, 2, 3, 4, or 5.");
            }
            
            System.out.println("Do you want to play again? (y/n)");
            String playAgainInput = scanner.next();
            
            if (playAgainInput.equals("n")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thanks for playing, " + name + "!");
    }
}
