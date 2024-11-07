import edu.duke.*;
import java.io.*;

public class DNAAnalyzer {
    public StorageResource getAllGenes(String dna) {
        StorageResource geneList = new StorageResource();
        int startIndex = 0;
        
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            geneList.add(gene);
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
        return geneList;
    }

    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        
        int minIndex = taaIndex;
        if (minIndex == -1 || (tgaIndex != -1 && tgaIndex < minIndex)) {
            minIndex = tgaIndex;
        }
        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1) {
            return "";
        }
        
        return dna.substring(startIndex, minIndex + 3);
    }

    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex;
            if (diff % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return -1;
    }

    public double cgRatio(String dna) {
        int countCG = 0;
        for (char c : dna.toCharArray()) {
            if (c == 'C' || c == 'G') {
                countCG++;
            }
        }
        return (double) countCG / dna.length();
    }

    public int countCTG(String dna) {
        int count = 0;
        int start = 0;
        while (true) {
            int pos = dna.indexOf("CTG", start);
            if (pos == -1) {
                break;
            }
            count++;
            start = pos + 3;
        }
        return count;
    }

    public void processGenes(StorageResource sr) {
        int longGenes = 0;
        int highCgGenes = 0;
        int longestGene = 0;

        for (String gene : sr.data()) {
            if (gene.length() > 60) {
                longGenes++;
            }
            if (cgRatio(gene) > 0.35) {
                highCgGenes++;
            }
            if (gene.length() > longestGene) {
                longestGene = gene.length();
            }
        }

        System.out.println("Total genes: " + sr.size());
        System.out.println("Genes longer than 60: " + longGenes);
        System.out.println("Genes with CG ratio > 0.35: " + highCgGenes);
        System.out.println("Length of longest gene: " + longestGene);
    }

    public void analyzeDNA() {
        FileResource fr = new FileResource("C:\\Users\\oscar\\Downloads\\DNAAnalyzer\\GRch38dnapart.fa.txt");
        String dna = fr.asString().toUpperCase();

        StorageResource genes = getAllGenes(dna);
        processGenes(genes);
        System.out.println("CTG codon count: " + countCTG(dna));
    }

    public static void main(String[] args) {
        DNAAnalyzer analyzer = new DNAAnalyzer();
        analyzer.analyzeDNA();
    }
}
