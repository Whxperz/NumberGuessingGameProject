import java.util.Scanner;

public class NumberGuessingProject {

    public static void main(String[]args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Declare
        String cont_game;
        int pickedNumber;
        String high_low;
        int numberoftry;

        do{

            pickedNumber = (int) (Math.random() * 100);

        //Code
        //  System.out.println(pickedNumber);
            System.out.println("Pick a number");

        int guess;
        high_low ="";
        numberoftry = 0;
        do {
            guess = keyboard.nextInt();
            numberoftry++;
           // System.out.println(numberoftry);
            if (guess > pickedNumber)
                high_low = "Too high";
            else if (guess < pickedNumber)
                high_low = "Too low";
            else if (guess == pickedNumber) {
                System.out.println("Good job! The number is " + guess + "!");
                break;
            }
           if (numberoftry == 5) {
                System.out.println(high_low);
                System.out.println("You used all your tries");
                break;
            }
            else
                System.out.println(high_low +", guess again");
        } while (guess != pickedNumber);
        System.out.println("Do you want to play again Yes/No?");
        cont_game = keyboard.next();
    } while (cont_game.equalsIgnoreCase("Yes"));
       System.out.println("Thank you for playing! Have a nice day!");
    }
}
