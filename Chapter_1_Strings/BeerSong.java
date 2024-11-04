public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer.");
            beerNum = beerNum - 1;
            
            if (beerNum > 0) {
                System.out.println("Take one down, pass it around, " + beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
