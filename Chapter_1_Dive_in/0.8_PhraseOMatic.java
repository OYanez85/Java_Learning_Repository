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
