public class AllCodons { // Define the AllCodons class

    public int findStopCodon(String dnaStr, int startIndex, String stopCodon) { // Method to find the stop codon
        int currIndex = dnaStr.indexOf(stopCodon, startIndex + 3); // Find the stop codon starting from (startIndex + 3)

        while (currIndex != -1) { // While a valid stop codon index is found
            int diff = currIndex - startIndex; // Calculate the distance from startIndex to currIndex
            if (diff % 3 == 0) { // Check if the distance is a multiple of 3
                return currIndex; // Return currIndex if it is a multiple of 3
            } else { // Otherwise, if not a multiple of 3
                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1); // Update currIndex to the next stop codon
            }
        }
        return dnaStr.length(); // Return the length of dnaStr if no valid stop codon is found
    }

    public String findGene(String dna) { // Method to find a gene within a DNA sequence
        int startIndex = dna.indexOf("ATG"); // Find the start codon "ATG"
        if (startIndex == -1) { // If "ATG" is not found
            return ""; // Return an empty string
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA"); // Find "TAA" stop codon from startIndex
        int tagIndex = findStopCodon(dna, startIndex, "TAG"); // Find "TAG" stop codon from startIndex
        int tgaIndex = findStopCodon(dna, startIndex, "TGA"); // Find "TGA" stop codon from startIndex
        int temp = Math.min(taaIndex,tagIndex);
        int minIndex = Math.min(temp, tgaIndex); // Find the minimum of the three stop codon indices

        if (minIndex == dna.length()) { // If no valid stop codon is found (minIndex equals dna length)
            return ""; // Return an empty string
        }
        return dna.substring(startIndex, minIndex + 3); // Return the gene from startIndex to minIndex + 3
    }

    public void testFindStop() { // Method to test the findStopCodon function
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxx"; // Define a test DNA string
        int dex = findStopCodon(dna, 0, "TAA"); // Test findStopCodon with "TAA" at start index 0
        if (dex != 9) System.out.println("error on 9"); // Check if the result is 9; print error if not

        dex = findStopCodon(dna, 9, "TAA"); // Test findStopCodon with "TAA" at start index 9
        if (dex != 21) System.out.println("error on 21"); // Check if the result is 21; print error if not

        dex = findStopCodon(dna, 1, "TAA"); // Test findStopCodon with "TAA" at start index 1
        if (dex != 26) System.out.println("error on 26"); // Check if the result is 26; print error if not

        dex = findStopCodon(dna, 0, "TAG"); // Test findStopCodon with "TAG" at start index 0
        if (dex != 26) System.out.println("error on 26 TAG"); // Check if the result is 26; print error if not

        System.out.println("tests finished"); // Print message indicating tests are complete
    }
}
