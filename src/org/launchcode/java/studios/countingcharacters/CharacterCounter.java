package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String exampleText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        String phrase = input.nextLine();
        char[] charactersInString = phrase.toCharArray();
        char[] exampleStringToChar = exampleText.toCharArray();

        HashMap<Character, Integer> numOfChars = new HashMap<>();

        for (int i = 0; i < exampleStringToChar.length; i++){
            //Add or update the count of each character into the hash map

            char theCharacter = exampleStringToChar[i];
            if (numOfChars.containsKey(theCharacter) == false){
                //Does not contain the key
                numOfChars.put(theCharacter, 1);
            }else {
                //Does contain the key
                Integer theValue = numOfChars.get(theCharacter);
                theValue = theValue + 1;
                numOfChars.put(theCharacter, theValue);
            }
        }
        ArrayList<Character> characterKeys = new ArrayList<>(numOfChars.keySet());
        for (int i = 0; i < characterKeys.size(); i++){
            Integer theValue = numOfChars.get(characterKeys.get(i));
            System.out.println(characterKeys.get(i) + ": " + theValue);
        }
    }
}


//        Path phrase = Paths.get(quote.txt);
//        System.out.println("Enter a phrase: ");
//        File phrase = new File();
//        char[] charactersInString  = phrase.toCharArray();
//        HashMap<Character, Integer> counts = new HashMap<>();
//        for (char character:
//             charactersInString) {
//            //check if character exists in the map
//            if (counts.containsKey(character)){
//                //if it is, we will get the value, increment it by one
//                Integer value = counts.get(character);
//                value += 1;
//                counts.put(character, value);
//            }
//            //if its not, then we will use put()
//        }