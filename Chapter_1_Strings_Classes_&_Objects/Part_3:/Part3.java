public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int firstOccurrence = stringb.indexOf(stringa);
        if (firstOccurrence == -1) {
            return false; // No occurrence
        }
        int secondOccurrence = stringb.indexOf(stringa, firstOccurrence + stringa.length());
        return secondOccurrence != -1; // Check for second occurrence
    }

    public String lastPart(String stringa, String stringb) {
        int firstOccurrence = stringb.indexOf(stringa);
        if (firstOccurrence == -1) {
            return stringb; // Return whole stringb if stringa is not found
        }
        return stringb.substring(firstOccurrence + stringa.length()); // Return part after stringa
    }

    public void testing() {
        System.out.println("twoOccurrences(\"by\", \"A story by Abby Long\"): " + twoOccurrences("by", "A story by Abby Long"));
        System.out.println("twoOccurrences(\"a\", \"banana\"): " + twoOccurrences("a", "banana"));
        System.out.println("twoOccurrences(\"atg\", \"ctgtatgta\"): " + twoOccurrences("atg", "ctgtatgta"));

        System.out.println("lastPart(\"an\", \"banana\"): " + lastPart("an", "banana"));
        System.out.println("lastPart(\"zoo\", \"forest\"): " + lastPart("zoo", "forest"));
    }

    public static void main(String[] args) {
        Part3 p3 = new Part3();
        p3.testing();
    }
}
