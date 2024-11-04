import edu.duke.*;

public class Part4 {
    public void findYouTubeLinks() {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String word : url.words()) {
            String lowerWord = word.toLowerCase();
            int index = lowerWord.indexOf("youtube.com");
            if (index != -1) {
                int start = word.lastIndexOf("\"", index);
                int end = word.indexOf("\"", index + 1);
                System.out.println(word.substring(start + 1, end)); // Extract the full URL
            }
        }
    }

    public static void main(String[] args) {
        Part4 p4 = new Part4();
        p4.findYouTubeLinks();
    }
}
