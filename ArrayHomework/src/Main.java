// Program designed to test method named allUniqueCharacters.

import java.util.Scanner;   //Import Scanner class

public class Main
{
    public static void main (String[] args)     //Main method written to test method named allUniqueCharacters
    {
        String userString = " ";        //String var to hold input from user (input being tested)
        Boolean isUnique = false;       //Boolean var to hold determination returned by method named allUniqueCharacters

        //Create new scanner object
        Scanner keyboard = new Scanner(System.in);

        //Prompt user for a string to test and save as var userString
        System.out.println("Enter a string.");
        userString = keyboard.nextLine();

        //Fill var isUnique with determination returned by method named allUniqueCharacters
        isUnique = allUniqueCharacters(userString);

        //If-else statement to output whether all characters are unique or not
        if(isUnique == true)
        {
            System.out.println("This string has all unique characters.");
        }
        else
        {
            System.out.println("This string does not have all unique characters.");
        }
    }

    /**Method built to determine if all characters input by user in a String are unique.
     @param inputString string input by user to be tested for unique characters
     @return true if all char are unique or false if string has repeated char
     */
    public static boolean allUniqueCharacters (String inputString)
    {
        //For loop to cycle through each char in the var inputString
        for(int i = 0; i < inputString.length(); i++)
        {
            //Vars to hold each character and increment number of occurrences in inputString
            char letter = inputString.charAt(i);
            int letterCounter = 0;

            //For loop to cycle through inputString a second time to compare each letter to all other chars
            for(int j = 0; j < inputString.length(); j++)
            {
                char compareLetter = inputString.charAt(j);

                //If statement to increment counter for each occurrence of a char
                if(letter == compareLetter)
                {
                    letterCounter++;
                }
            }
            //If statement to determine if any char is repeated within inputString - Boolean
            if(letterCounter > 1)
            {
                return false;
            }
        }
        return true;
    }
}
