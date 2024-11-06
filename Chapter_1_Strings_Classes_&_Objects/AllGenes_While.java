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

    public String findGene(String dna, int where) { // Method to find a gene within a DNA sequence
        int startIndex = dna.indexOf("ATG", where); // Find the start codon "ATG"
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
		    }
		
		public void printAllGenes(String dna) {
			int startIndex = 0;
			while ( true ) {
			   String currentgene = findGene(dna, startIndex);
			   if (currentGene.isEmpty()) {
			        break;
			  }
			  System.out.println(currentGene);
		}
   public void testOn(String dna) {
    System.out.println("Testing printAllGenes on " + dna);
    printAllGenes(dna);
}

	public void test() {
    testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
    testOn("");
    testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
}

    }

    public static void main(String[] args) {
        AllCodons tester = new AllCodons();
        tester.testFindStop(); // Run the test cases for findStopCodon
        tester.testFindGene(); // Run the test cases for findGene
    }
}
