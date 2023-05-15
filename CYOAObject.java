import java.util.Scanner;

public class CYOAObject {
    
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to roped in, hope you have a blast!");
       
        
        boolean playAgain = true;
        
        while (playAgain) {
        	System.out.println("???: Hey wake up man!");
        	System.out.println("You stumble awake, and quickly look out the window in a daze, it's almost pitch black out with the last of the sun going under the horizon.");
        	System.out.println("You feel lost for a second until you remember what is happening.");
        	System.out.println("You're in a big van with 3 others, your friends since elementary.");
        	System.out.println("You all were always into the filming industry and even put it as your major for college, you all have been with each other since the beginning.");
        	System.out.println("You think to yourself for a second, trying to recollect yourself, quickly looking at the list of your group for the project you're doing in college.");
        	System.out.println("Of course, it's you four in the group: mchensy, staffard, wuggle, and");
        	System.out.println("-enter name-");
           String name = scanner.nextLine();
            System.out.println("As everything now is coming back to you your friend finally gets your attention" +"Staffard:" +  name +", You good? ");
            System.out.println("You nod, knowing you're not a big talker, as your two friends continue talking about the project. Wuggles stops the van abruptly.");
            System.out.println("Wuggles: 'Hey guys, I think this is it.'");
            System.out.println("You look out the already dark window, seeing a huge house, a mansion about the size of 3 stories and many windows that seem to go to almost every room.");
            System.out.println("It seems run down and untouched for many years, but it's perfect for your group's scene.");
            System.out.println("Mchensy: 'This horror film is gonna be great! Not only do we have great props, but we also now have a perfect set!'");
            System.out.println("The college film you guys are filming, in particular, is a monster horror, planning to use CGI and props to have an emulated monster chase down different members of the crew.");
            System.out.println("Even as you step out of the van and start collecting items, it's a great set for what you guys need.");
            System.out.println("You grab your camera, your film stands, your backpack, your lucky lighter, and your tool belt for your camera, including a long line of 尺๏尸ヨ in case you need to hang props or such for scenes.");
            System.out.println("You have a lot on you, considering you have always been pretty fit.");
            System.out.println("As your friends continue to grab their items as well, you decide to head straightway, walking up the couple of steps of the wood porch to the front door of the house.");
            System.out.println("Slowly, you turn the knob and open the door.");
            System.out.println("You're greeted with a huge room with hallways on the left and right, and an upper floor with staircases on each side of the room going to the upper floors, also with halls.");
            System.out.println("Your friends walking behind you immediately get excited and start setting up to film.");
            System.out.println("While it is hard to see in the house, the cameras have night vision, not only adding to the film but also allowing you to see.");
            System.out.println("As you see everything in a dark hue of green, you could have sworn out of the corner of your camera you saw something at least 8 feet tall move quickly behind the hall to your left.");
            System.out.println("You immediately think it's your imagination, but just in case, you decide to...");
            System.out.println("Choose by number:");
            System.out.println("1. Check the hall where the movement was with Staffard");
            System.out.println("2. Tell your friends about what you saw");
            System.out.println("3. Walk to the right-side hall");
            System.out.println("4. Mention the upstairs");
            System.out.println("5. Yell ----");
            String choice = scanner.next();
            
              if (choice.equals("1")) {
            	System.out.println("You nudge Staffard and point towards the hall, him seeing the scared look on your face knows something must be up. Staffard tells Mchensy and Wuggle that you and him are going to check it out before you start heading towards the left hall. As you all turn towards the hall, it has about 6 rooms on each end. You both begin to walk down as you see the 4th door to the left is slightly open.");
            	System.out.println("Staffard: If I remember correctly, all the doors to the houses should be locked from what I heard...");
            	System.out.println("You shrug, not knowing why he had such information, but knowing this puts you on edge. You try to stop Staffard from going to the door to open it, but knowing your friend's curiosity for the unknown, he just follows from behind until you reach the door.");
            	System.out.println("As he slowly opens it, the room is pitch black, even darker than the rest of the house. As Staffard turns around to you, he laughs.");
            	System.out.println("Staffard: Paranoia, eh? Take a picture of me. This room is so much darker than the rest of the house. Wanna see what it looks like through the vision on the camera.");
            	System.out.println("As you laugh it off with him, you pull the camera to your eyes... An 8ft figure looms overhead him from behind. You instantly turn from laughing to sorrow as you see a huge claw go straight through Staffard's innards, also piercing you. You both gag blood as you try to get out of its claw. It throws you both to the ground.");
            	System.out.println("You don't want to die. You try to stand, slowly getting up with the help of the wall, but then your vision turns backwards. Your body flops as your head is still in the air. The last thing you see is the monster running towards the end of the hall, straight towards your two other friends. Your vision goes black...");
                  
            } else if (choice.equals("2")) {
            	System.out.println("You get the attention of your friends before telling them what you saw. Of course, none of them believe you. You should have used the code word that you and your friends used when you were little to warn of bullies. It was your code for emergencies. As you are about to say the keyword, you quickly see a figure move on the walls, heading straight for your friend Mchensy. It quickly rips his body in half, splattering blood over you and your friend Wuggle. You are about to scream, but you are quickly stopped by the blood-curdling scream of Wuggle next to you. His body is gouged and thrown at you, causing him to lay limp on top of you.");
            	System.out.println("Fear sets in, and you push the now cold corpse of your friend off and quickly run towards the door. But as you reach it, you realize the door is bolted locked from the other side. You realize that the monster locked the door. It planned all of this.");
            	System.out.println("You are going to die. Panic sets in. You try to yank the door open quickly, but it won't budge. You desperately search for a way out, but there seems to be no escape. The monster is eating out the left side of Staffard's face as you struggle.");
            	System.out.println("You hear a voice in your head, 'Run. Why don't you run? Move. Why don't you move?' Life is so unfair. You plead to yourself for life and wish you had said the code word sooner. But it's too late. You get dragged away from the door into the dark depths of the house, never to be seen again...");
                  
            } else if (choice.equals("3")) {
            	System.out.println("You ignore the movement thinking it was just your imagination, not really caring whether to tell your friends or not. Probably just your imagination. As you ask, Wuggle over so you don't have to go alone. You both head over there, checking where you can set a scene. As you guys walk down the hallways, you notice random patches of holes in the ground. You get Wuggle's attention and point down at the holes in the floor.");
            	System.out.println("Wuggle: 'Nice catch,"+ name +"! We can use this for a scene where someone gets their foot stuck or something, you know? Quick, hold me while I put my foot in to see how deep it is.'");
            	System.out.println("You help Wuggle put one leg in the hole, going about a foot deep. You both seem surprised by how deep the hole goes, realizing it could probably go even deeper if you wanted to test it, but neither of you want to try. As you are about to help Wuggle pull his leg out, he yelps. You jump in surprise, and before any action can be taken, he gets pulled under in one fell swoop, crashing through the floor and caving it in. A split second later, you immediately hear quick screaming, then silence.");
            	System.out.println("In fear, you quickly get up and run back to your two other friends near the middle of the entrance of the house. But as you are about to yell about what happened, you realize that no one is there. You are alone.");
            	System.out.println("You are in danger, and you know it. You quickly rush to the window, breaking it with one of the stands Mchensy has set up earlier. You jump out and run over to the van, quickly realizing you don't have the keys as Wuggle had them. As you are about to start running from the house, you notice something roll towards you from just a few feet away. It rolls to your feet, and you look down, seeing your friend's head. Your friend, who was alive not even five minutes ago, is now decapitated. His last look was horror and fear.");
            	System.out.println("You already know that the monster is just a few feet away from you, waiting for a reaction. It's playing with you, like a predator playing with its prey. You close your eyes, waiting for the pain to wash over you as you give your final breaths.");

            } else if (choice.equals("4")) {
                System.out.println("You mention the upstairs, pointing up. Your friends say it's not worth setting up there since the scenes are already so good at the bottom. You were going to say you would feel safer up there, but then there was a loud bang from beneath your feet.");
                System.out.println("You instantly freeze for a second before moving away quickly from the spot you were standing, but the sound follows you. Your friends hear it as well and immediately realize something is wrong.");
                System.out.println("You all quickly start packing your things, thinking maybe it's some sick prank or a weird earthquake. The sound continues to follow you until the floor starts cracking from beneath you.");
                System.out.println("You all quickly bolt out the door only to see one of your friends, Staffard, fall into a hole right in front of the porch. He falls at least 11 feet and doesn't look conscious.");
                System.out.println("As you use your gadget to go down the hole with your friends holding it from the top, you hear a loud bang from where they're at. You look up. A splotch of blood goes into your left eye as you see both your friends hanging lifelessly from a huge claw. The monster's other hand is holding the rope. It smiles.");
                System.out.println("Your journey is about to end. You let go, allowing yourself to fall down the hole next to your friend. The last thing you see is the monster jumping down, crushing your head.");
                  
            } else if (choice.equals("5")) {
                System.out.println("You yell the code word your friends have used since they were little, and immediately everyone turns their heads toward you. They seem surprised for a second before immediately coming toward you.");
                System.out.println("You panic because you don't know if what you saw was your imagination or if it could potentially put them in danger. However, you don't want to take any risks. You quickly rush everyone upstairs.");
                System.out.println("As you guys are halfway up the long staircase, you hear something rushing from behind. You pull yourself up faster, turn around, and flash your camera light at the thing behind you.");
                System.out.println("It shrieks at the light, stopping in its tracks for a second. It stands at 8 feet tall with huge horns on its cheeks, extending to its mouth, and has massive claws and terrifying arms—an ugly abomination.");
                System.out.println("You continue up the stairs until you hear a scream next to you. Mchensy's body falls, and you see a leg falling through the air. You quickly turn around and notice the leg in the claws of the monster.");
                System.out.println("You grab one of the camera stands you have and throw it like a spear, piercing the monster's eye—a lucky shot. It screams in rage and falls down the stairs.");
                System.out.println("You and Staffard quickly help Mchensy up the stairs. As soon as you guys make it up there, you start discussing a plan with your crew to escape.");
                System.out.println("However, suddenly couches and chairs are thrown through the floor with tremendous strength around you. The destruction causes each side of the floor to collapse, revealing the first floor below on both sides, about 10 feet apart.");
                System.out.println("You can see the monster down there, looking up in rage with its one remaining eye. It can't reach you from there, but anyone hanging could be in danger.");
                System.out.println("Your worst fears come to life as you see that your friends have been caught up. It's now up to you—Staffard hangs off the ledge to the left, while Wuggle hangs to the right, and Mchensy is safe in the middle but unable to help due to their severed leg.");
                System.out.println("The creature is attempting to reach either of them, and you only have a limited amount of time. What do you do?");

                
                   System.out.println("One of the choices here need a keyword of four characters to unlock, the rest is chosen by there numbers. ???? , 1. save Staffard, 2.save Wuggle, 3.save Mchensy, 4.Run, are your choices");
                String choice2 = scanner.next();
                
                if (choice2.equals("1")) {
                   System.out.println("You pull Staffard up and immediately tell him to grab Wuggle. You try to carry Mchensy but realize you want to do it alone, especially with that thing downstairs.");
                   System.out.println("In an act of stupid courage, you tell both your other friends to help Mchensy as you jump down right into the monster's face, straight on with your feet.");
                   System.out.println("It screeches in surprise before realizing its overwhelming strength, grabbing you and biting your arms off. You scream in pain as your friends escape.");
                   System.out.println("Hero's end.");

                } else if (choice2.equals("2")) {
                   System.out.println("You go towards Wuggle but fall and knock his arm, causing him to fall to his death to the monster. Mchensy screams in fright and goes delirious, having a heart attack, killing him on the spot.");
                   System.out.println("You immediately help Staffard and escape, but not before realizing that Wuggle still had the keys.");
                   System.out.println("\"Clumsy\" end.");

                } else if (choice2.equals("3")) {
                   System.out.println("You don't bother with either of your other friends, thinking of them as lost causes. You hoist Mchensy and leave the other two as bait while you two escape to the woods.");
                   System.out.println("A couple of days later, a search team finds you in the mountains. Unfortunately, by then both of you have been eaten by wolves, and there is nothing left but decomposed bodies.");
                   System.out.println("\"Cowards Savior\" end.");
                } else if (choice2.equals("4")) {
                   System.out.println("Scared for your life, you run, leaving your friends behind. As they cry in anguish over your betrayal, you run down the mountain and are found a couple of days later.");
                   System.out.println("You survived, but at what cost? No one believed your story, and eventually, you are convicted of killing your three friends.");
                   System.out.println("You sit alone in prison in silence, slowly rotting away for the rest of your life.");
                   System.out.println("\"Unforgiven\" end.");
                    
                } else if (choice2.equals("rope")) {
                   System.out.println("You use the rope, throwing each end at both sides while tying it to yourself, pulling them both up at the same time, saving you so much time. You immediately tell the two to give you their cameras. They comply, and you immediately look down to where the monster is.");
                   System.out.println("You take out the lithium battery and pull out your lucky lighter. With a kiss goodbye to the lighter, you quickly light it using the lithium battery and throw it down onto the monster, setting it ablaze.");
                   System.out.println("The monster starts squirming on the ground. Taking advantage of the distraction, you and your friends bolt out of the house and into the van. Most of the house is now set on fire.");
                   System.out.println("As the car is being turned on, you see the silhouette of the monster through the flames, staring at you. It seems as if there's a sense of longing in its eyes, but you pay it no mind.");
                   System.out.println("Your friend steps on the gas, and you leave the burning house behind, driving into the distance.");
                   System.out.println("\"True\" end.");
                    
                } else {
                   System.out.println("Invalid input. Please enter 1, 2, 3, 4, or ----.");
                }
            } else {
                  System.out.println("Invalid input. Please enter 1, 2, 3, 4, or 5.");
            }
            
            System.out.println("...play again? (y/n)");
            String playAgainInput = scanner.next();
            
            if (playAgainInput.equals("n")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thanks for playing!");
    }
    
    public static void main(String[] args) {
        playGame();
    }
}
