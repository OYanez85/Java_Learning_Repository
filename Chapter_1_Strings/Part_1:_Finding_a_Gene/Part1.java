public class Part1 {
    public String findSimpleGene(String dna) {
        int startCodon = dna.indexOf("ATG");
        if (startCodon == -1) {
            return ""; // No start codon found
        }
        int stopCodon = dna.indexOf("TAA", startCodon + 3);
        if (stopCodon == -1) {
            return ""; // No stop codon found
        }
        // Check if the gene length is a multiple of 3
        if ((stopCodon - startCodon) % 3 == 0) {
            return dna.substring(startCodon, stopCodon + 3);
        } else {
            return ""; // Not a valid gene
        }
    }

    public void testSimpleGene() {
        String dna1 = "AATGCGTAATATGGT"; // DNA with no "TAA"
        String dna2 = "AATGCTAGGGTAATATGGT"; // Valid gene
        String dna3 = "ATCCTATGCTTCGGCTGCTCTAATATGGT"; // Valid gene
        String dna4 = "CCCATGGGGTTTAA"; // DNA with "ATG" and "TAA" but invalid length
        String dna5 = "TGCATCGGTCGA"; // DNA with no "ATG" and "TAA"

        System.out.println("DNA: " + dna1 + " -> Gene: " + findSimpleGene(dna1));
        System.out.println("DNA: " + dna2 + " -> Gene: " + findSimpleGene(dna2));
        System.out.println("DNA: " + dna3 + " -> Gene: " + findSimpleGene(dna3));
        System.out.println("DNA: " + dna4 + " -> Gene: " + findSimpleGene(dna4));
        System.out.println("DNA: " + dna5 + " -> Gene: " + findSimpleGene(dna5));
    }

    public static void main(String[] args) {
        Part1 p1 = new Part1();
        p1.testSimpleGene();
    }
}
