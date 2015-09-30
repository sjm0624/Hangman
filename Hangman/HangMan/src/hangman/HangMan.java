package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

    public static void main(String[] args) {

        // user intro
        System.out.println("Hello welcome to HangMan");
        System.out.println("The obecjt of this game is to guess all the letters of the word.");
        System.out.println("You get three tries");

        //create an arraylist to store the words that will be guessed
        ArrayList<String> wordBank = new ArrayList<>();

        //assign words to the wordbank in the array list 
        wordBank.add("car");
        wordBank.add("house");
        wordBank.add("girl");
        wordBank.add("boy");
        wordBank.add("farm");

        //create the random object generator  
        Random rand = new Random();

        //this variable holds the random number generated
        int numberStored = rand.nextInt(5);

        //the random number generated will link to the index of the arraylist to generate the random word
        String randomWord = wordBank.get(numberStored);

        //creation of underscored word using string build because regular string
        // you cant edit the string directly
        StringBuilder underscoredWord = new StringBuilder();
        for (int j = 0; j < randomWord.length(); j++) {
            underscoredWord = underscoredWord.append("_ ");
        }
        //display the underscores for amount of letters in the word        
        System.out.println(underscoredWord);
        //create scanner object to accept input from user
        Scanner input = new Scanner(System.in);
        //this while loop controls the number of guesses and what to do
        //with each guess
        int wrongGuesses = 0;
        int rightGuess = 0;
        while (wrongGuesses != 3 && rightGuess != randomWord.length()) {
            //prompt 
            System.out.printf("Guess a letter you think is in the word "
                    + "");
            //create a variable to hold the guessed letter
            //also converts any capital letters to lowercase letters
            String guessLetter = input.nextLine().toLowerCase();
            //check to see if guessed letter is in the random word 
            // if else statment to decide what to do with guessed letter
            if (randomWord.contains(guessLetter)) {
                System.out.println("Letter " + guessLetter + " is correct");

                //find the index/position of the guessed letter 
                int index = randomWord.indexOf(guessLetter);
                index = index * 2;

                //this line converts the guess letter to a char so i can pass it as an arugment to the string 
                //builder find and replace method using index number
                char c = guessLetter.charAt(0);
                underscoredWord = underscoredWord.replace(index, index +1, guessLetter);

                //Take the index of the guessed letter and display it in the word
                System.out.println(underscoredWord);
                //prompt
                System.out.println("Now guess a different letter");
                //counter for number of correct guesses
                rightGuess = rightGuess +1 ;
            } else {
                //prompt
                System.out.println("Sorry " + guessLetter + " is not in the word");
                System.out.println("Try again");
                //counter for the number of incorrect guesses
                wrongGuesses = wrongGuesses +1 ;
            }
        }
        //prompt
        System.out.println("Game Over");
    }
}
