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
        return -1 
    }

    public String findGene(String dna) { // Method to find a gene within a DNA sequence
        int startIndex = dna.indexOf("ATG"); // Find the start codon "ATG"
        if (startIndex == -1) { // If "ATG" is not found
            return ""; // Return an empty string
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA"); // Find "TAA" stop codon from startIndex
        int tagIndex = findStopCodon(dna, startIndex, "TAG"); // Find "TAG" stop codon from startIndex
        int tgaIndex = findStopCodon(dna, startIndex, "TGA"); // Find "TGA" stop codon from startIndex
        //int temp = Math.min(taaIndex, tagIndex);
        //int minIndex = Math.min(taaIndex,Math.min(tagIndex,tgaIndex));
        //int minIndex = Math.min(temp, tgaIndex); // Find the minimum of the three stop codon indices
				int minIndex = 0;
				if (taaIndex == -1 ||
					  (tgaIndex != -1 && tgaIndex < taaIndex)) {
						    minIndex = tgaIndex;
			  }
			  else {
					  minIndex = taaIndex;
			  }

        if (minIndex == -1 ||
            (tagIndex != -1 && tagIndex < minIndex)) { // If no valid stop codon is found (minIndex equals dna length)
            minIndex = tagIndex; // Return an empty string
        }
        if (minIndex == -1){
		        return "";
		    }
		    
		    return dna.substring(startIndex,minIndex + 3);

    public void testFindStop() { // Method to test the findStopCodon function
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxx"; // Define a test DNA string
        int dex = findStopCodon(dna, 9, "TAA"); // Test findStopCodon with "TAA" at start index 0
        if (dex != 9) System.out.println("error on 9"); // Check if the result is 9; print error if not

        dex = findStopCodon(dna, 21, "TAA"); // Test findStopCodon with "TAA" at start index 9
        if (dex != 21) System.out.println("error on 21"); // Check if the result is 21; print error if not

        dex = findStopCodon(dna, 26, "TAA"); // Test findStopCodon with "TAA" at start index 1
        if (dex != -1) System.out.println("error on 26"); // Check if the result is 26; print error if not

        dex = findStopCodon(dna, 26, "TAG"); // Test findStopCodon with "TAG" at start index 0
        if (dex != -1) System.out.println("error on 26 TAG"); // Check if the result is 26; print error if not

        System.out.println("tests finished"); // Print message indicating tests are complete
    }

    public void testFindGene() { // Method to test the findGene function
        AllCodons allCodons = new AllCodons(); // Create an instance of AllCodons

        // Test case 1: No start codon ("ATG")
        String dna = "CCCGGGTTT"; // No "ATG" start codon
        String result = allCodons.findGene(dna);
        if (!result.equals("")) System.out.println("Error: expected empty string for no start codon");

        // Test case 2: No stop codon after "ATG"
        dna = "ATGCCCGGG"; // "ATG" found but no valid stop codon
        result = allCodons.findGene(dna);
        if (!result.equals("")) System.out.println("Error: expected empty string for no stop codon");

        // Test case 3: Valid gene with "TAA" as the stop codon
        dna = "ATGCCCGGGAAATTTTAA"; // Gene: "ATGCCCGGGAAATTT"
        result = allCodons.findGene(dna);
        if (!result.equals("ATGCCCGGGAAATTT")) System.out.println("Error: expected 'ATGCCCGGGAAATTT'");

        // Test case 4: Valid gene with "TAG" as the stop codon
        dna = "ATGCCCGGGTAG"; // Gene: "ATGCCCGGGTAG"
        result = allCodons.findGene(dna);
        if (!result.equals("ATGCCCGGGTAG")) System.out.println("Error: expected 'ATGCCCGGGTAG'");

        // Test case 5: Valid gene with "TGA" as the stop codon
        dna = "ATGCCCGGGTGA"; // Gene: "ATGCCCGGGTGA"
        result = allCodons.findGene(dna);
        if (!result.equals("ATGCCCGGGTGA")) System.out.println("Error: expected 'ATGCCCGGGTGA'");

        // Test case 6: Multiple stop codons, closest valid one used
        dna = "ATGCCCGGGTAAATGTAGTGA"; // Gene should end at the first valid stop codon, "TAA"
        result = allCodons.findGene(dna);
        if (!result.equals("ATGCCCGGGTAA")) System.out.println("Error: expected 'ATGCCCGGGTAA'");

        // Test case 7: Stop codon not a multiple of 3 from "ATG"
        dna = "ATGCCCAGTAGTGA"; // "TAG" and "TGA" are not multiples of 3 away
        result = allCodons.findGene(dna);
        if (!result.equals("")) System.out.println("Error: expected empty string for non-multiple of 3 stop codons");

        System.out.println("All tests completed"); // Print message indicating all tests are complete
    }

    public static void main(String[] args) {
        AllCodons tester = new AllCodons();
        tester.testFindStop(); // Run the test cases for findStopCodon
        tester.testFindGene(); // Run the test cases for findGene
    }
}
