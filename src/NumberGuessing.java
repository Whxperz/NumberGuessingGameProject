import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

   //Declare

        int pickedNumber;
        pickedNumber = (int)(Math.random()*100);

   //Code

        System.out.println("Pick a number");
        int guess = keyboard.nextInt();
        if(guess>pickedNumber){
            System.out.println("Too high, guess again");
            guess = keyboard.nextInt();
        }
        else if(guess<=pickedNumber) {
            System.out.println("Too low, guess again");
            guess = keyboard.nextInt();
        }
        else if(guess==pickedNumber) {
            System.out.println("Good job! The number is " + guess);
        }






    }
}

