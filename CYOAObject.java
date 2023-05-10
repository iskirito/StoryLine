import java.util.Scanner;

public class CYOAObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Choose Your Own Adventure game!");
        System.out.println("You find yourself in a dark room. There are four doors in front of you.");
        System.out.println("Do you want to go through door 1, 2, 3, or 4?");
        
        String choice = scanner.next();
        
        switch(choice) {
            case "1":
                System.out.println("You enter a room filled with gold and treasure!");
                System.out.println("But suddenly, the door slams shut behind you.");
                System.out.println("Do you try to find another way out, or search for more treasure?");
                System.out.println("Type 'escape' or 'treasure'");
                String goldChoice = scanner.next();
                
                if(goldChoice.equals("escape")) {
                    System.out.println("You search the room and find a hidden passage that leads to safety.");
                    System.out.println("Congratulations, you survived!");
                }
                else if(goldChoice.equals("treasure")) {
                    System.out.println("You search the room for more treasure, but as you do, the floor begins to shake.");
                    System.out.println("Suddenly, the floor gives way and you fall into a pit.");
                    System.out.println("GAME OVER");
                }
                break;
                
            case "2":
                System.out.println("You enter a room filled with dangerous-looking machinery.");
                System.out.println("There is a lever in front of you. Do you pull it?");
                System.out.println("Type 'yes' or 'no'");
                String machineChoice = scanner.next();
                
                if(machineChoice.equals("yes")) {
                    System.out.println("You pull the lever, and the machinery comes to life!");
                    System.out.println("It turns out to be a giant robot, which picks you up and throws you out of the room.");
                    System.out.println("You land safely outside, but are disappointed that you didn't get to fight the robot.");
                    System.out.println("YOU WIN!");
                }
                else if(machineChoice.equals("no")) {
                    System.out.println("You decide not to touch anything, and look for a way out.");
                    System.out.println("As you do, a hidden door slides open, revealing a staircase.");
                    System.out.println("You climb the stairs to safety.");
                    System.out.println("Congratulations, you survived!");
                }
                break;
                
            case "3":
                System.out.println("You enter a room with a large statue in the center.");
                System.out.println("The statue has three eyes, but only one of them is glowing.");
                System.out.println("Do you touch the glowing eye?");
                System.out.println("Type 'yes' or 'no'");
                String statueChoice = scanner.next();
                
                if(statueChoice.equals("yes")) {
                    System.out.println("You touch the glowing eye, and the statue comes to life!");
                    System.out.println("It turns out to be a guardian of the room, and it attacks you.");
                    System.out.println("You fight bravely, but the guardian is too strong.");
                    System.out.println("GAME OVER");
                }
                else if(statueChoice.equals("no")) {
                    System.out.println("You decide not to touch anything, and look for a way out.");
                    System.out.println("As you do, a hidden door slides open, revealing a staircase.");
                    System.out.println("You climb the stairs to safety.");
                    System.out.println("Congratulations, you survived!");
                }
                break;
                
            case "
