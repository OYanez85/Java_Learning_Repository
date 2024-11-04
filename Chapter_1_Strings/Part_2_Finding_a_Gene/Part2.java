public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String dnaUpper = dna.toUpperCase();
        startCodon = startCodon.toUpperCase();
        stopCodon = stopCodon.toUpperCase();

        int start = dnaUpper.indexOf(startCodon);
        if (start == -1) {
            return ""; // No start codon found
        }
        int stop = dnaUpper.indexOf(stopCodon, start + 3);
        if (stop == -1) {
            return ""; // No stop codon found
        }
        // Check if the gene length is a multiple of 3
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop + 3); // Return the original case
        } else {
            return ""; // Not a valid gene
        }
    }

    public void testSimpleGene() {
        String dna1 = "AATGCGTAATATGGT";
        String dna2 = "AATGCTAGGGTAATATGGT";
        String dna3 = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        String dna4 = "CCCATGGGGTTTAA";
        String dna5 = "tgcATCGGTCGA"; // Lowercase DNA test

        System.out.println("DNA: " + dna1 + " -> Gene: " + findSimpleGene(dna1, "ATG", "TAA"));
        System.out.println("DNA: " + dna2 + " -> Gene: " + findSimpleGene(dna2, "ATG", "TAA"));
        System.out.println("DNA: " + dna3 + " -> Gene: " + findSimpleGene(dna3, "ATG", "TAA"));
        System.out.println("DNA: " + dna4 + " -> Gene: " + findSimpleGene(dna4, "ATG", "TAA"));
        System.out.println("DNA: " + dna5 + " -> Gene: " + findSimpleGene(dna5, "atg", "taa"));
    }

    public static void main(String[] args) {
        Part2 p2 = new Part2();
        p2.testSimpleGene();
    }
}
