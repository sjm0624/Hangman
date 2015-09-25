/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import java.util.Random;

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
        for (int j = 0; j < randomWord.length() ; j++) {
        System.out.printf("_ ");
        }

        
       System.out.printf("/nGuess a letter");
       
       
       
       
        System.out.println("random word = " +randomWord);
    }
    
}
