/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

    /**
     * @param args the command line arguments
     */
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
        int numberStored;
        numberStored = rand.nextInt(5);

        //the random number generated will link to the index of the arraylist to generate the random word
        String randomWord;
        randomWord = wordBank.get(numberStored);

        //display dots to show number of letters in the word
        for (int j = 0; j < randomWord.length(); j++) {
            System.out.printf("_ ");
        }
        //create scanner object
        Scanner input = new Scanner(System.in);
        //this while loop controls the number of guesses
        int wrongGuesses = 0;
        while (wrongGuesses != 3) {
            //prompt 
            System.out.printf("Guess a letter you think is in the word");
            //create a variable to hold the guessed letter
            String guessLetter = input.nextLine();
            //check to see if guessed letter is in the random word 
            boolean value = randomWord.contains(guessLetter);
            // if else statment to decide what to do
            if (value == true) {
                System.out.println("Letter " + guessLetter + " is correct");
                System.out.println("Now guess a different letter");
                //find the position of the guessed letter in the word
                
                char g =  randomWord.charAt(0);
                //loop through all the letters of the word
                for (int j = 0; j < randomWord.length(); j++){
                    if (gueesLetter.eq)
                        int comparedstring
            }
                
            } else {
                System.out.println("Sorry "+guessLetter+ " is not in the word");
                System.out.println("Try again");
                wrongGuesses = wrongGuesses + 1;
            }
            System.out.println("random word = " + randomWord);
        }
    }
}
