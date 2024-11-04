public class PhraseOMatic {                     // Define the PhraseOMatic class
    public static void main (String[] args) {   // Main method where execution begins

        // Make three sets of words to choose from. Add your own!
        String[] wordListOne = {                // First list of words, array of Strings
            "agnostic", "opinionated", "voice activated", 
            "haptically driven", "extensible", "reactive", 
            "agent based", "functional", "AI enabled", 
            "strongly typed"
        };

        String[] wordListTwo = {                // Second list of words, array of Strings
            "loosely coupled", "six sigma", "asynchronous", 
            "event driven", "pub-sub", "IoT", 
            "cloud native", "service oriented", "containerized", 
            "serverless", "microservices", "distributed ledger"
        };

        String[] wordListThree = {              // Third list of words, array of Strings
            "framework", "library", "DSL", "REST API", 
            "repository", "pipeline", "service mesh", 
            "architecture", "perspective", "design", 
            "orientation"
        };

        // Find out how many words are in each list
        int oneLength = wordListOne.length;     // Length of the first word list
        int twoLength = wordListTwo.length;     // Length of the second word list
        int threeLength = wordListThree.length; // Length of the third word list

        // Generate three random numbers
        java.util.Random randomGenerator = new java.util.Random(); // Random number generator
        int rand1 = randomGenerator.nextInt(oneLength);            // Random index for wordListOne
        int rand2 = randomGenerator.nextInt(twoLength);            // Random index for wordListTwo
        int rand3 = randomGenerator.nextInt(threeLength);          // Random index for wordListThree

        // Now build a phrase
        String phrase = wordListOne[rand1] + " " +                 // Concatenate words to form a phrase
                        wordListTwo[rand2] + " " + 
                        wordListThree[rand3];

        // Print out the phrase
        System.out.println("What we need is a " + phrase);         // Output the generated phrase
    }
}

/*
 * Phrase-O-Matic: How it Works
 * 
 * Creating Arrays:
 * The program begins by creating three String arrays, each containing a list of words. 
 * These arrays serve as the source for generating random phrases.
 * Example of array declaration:
 * 
 * String[] pets = {"Fido", "Zeus", "Bin"};
 * 
 * Finding Array Lengths:
 * To randomly pick a word from each array, we need the length of each array to set the range 
 * for generating random indices. Java’s .length attribute is used to get the number of elements in an array.
 * Example:
 * 
 * int x = pets.length;
 * 
 * Generating Random Numbers:
 * Java’s Random class is used to generate random indices. The nextInt(n) method generates a random number 
 * between 0 (inclusive) and n (exclusive). This is essential for selecting random elements from each array.
 * Example:
 * 
 * int x = randomGenerator.nextInt(5); // random number from 0 to 4
 * 
 * Building the Phrase:
 * A phrase is created by picking a random word from each array and concatenating them with spaces in between.
 * The + operator is used to concatenate String values.
 * Example:
 * 
 * String s = pets[0]; // sets `s` to "Fido"
 * s = s + " is a dog"; // `s` becomes "Fido is a dog"
 * 
 * Printing the Phrase:
 * The final phrase is printed to the console, completing the program. 
 * The result is a randomly generated, marketing-style phrase based on the words in the arrays.
 * 
 * This page explains the step-by-step logic behind the Phrase-O-Matic program, covering how to set up arrays, 
 * generate random indices, build phrases, and print the output. It’s a simple demonstration of using arrays 
 * and randomization in Java.
 */
