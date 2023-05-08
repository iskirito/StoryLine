import java.util.*;
public class CYOAObject {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Choose Your Own Adventure game!");
        System.out.println("You are walking through a forest when you come across a fork in the path.");
        System.out.println("Do you want to go left or right?");

        String choice = scanner.next();

        if (choice.equals("left")) {
            System.out.println("You come across a river. Do you want to swim across or follow the river?");
            String riverChoice = scanner.next();
            if (riverChoice.equals("swim")) {
                System.out.println("You make it across the river, but your backpack gets soaked and your supplies are ruined.");
                System.out.println("GAME OVER");
            } else if (riverChoice.equals("follow")) {
                System.out.println("You follow the river and come across a hidden cave.");
                System.out.println("Inside the cave, you find a treasure chest with gold and jewels!");
                System.out.println("YOU WIN!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else if (choice.equals("right")) {
            System.out.println("You come across a tall mountain. Do you want to climb it or go around?");
            String mountainChoice = scanner.next();
            if (mountainChoice.equals("climb")) {
                System.out.println("You begin to climb the mountain but quickly realize it's too steep.");
                System.out.println("You slip and fall to your death.");
                System.out.println("GAME OVER");
            } else if (mountainChoice.equals("go around")) {
                System.out.println("You go around the mountain and come across a beautiful meadow.");
                System.out.println("You set up camp and enjoy the stunning views.");
                System.out.println("YOU WIN!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
