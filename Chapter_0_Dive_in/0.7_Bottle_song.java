public class BottlesSong {                     // Class definition for BottlesSong
    public static void main (String[] args) {   // Main method where execution begins
        int bottlesNum = 10;                    // Initialize the number of bottles to 10
        String word = "bottles";                // Set initial word to "bottles"

        while (bottlesNum > 0) {                // Loop as long as there are bottles left

            if (bottlesNum == 1) {              // Check if only one bottle is left
                word = "bottle";                // Change word to "bottle" for singular form
            }

            System.out.println(bottlesNum + " " + word + " of green tea on the wall"); // Print current number of bottles on the wall
            System.out.println(bottlesNum + " " + word + " of green tea");             // Print current number of bottles
            System.out.println("Take one down.");                                       // Print action of taking one down
            System.out.println("Pass it around.");                                      // Print action of passing it around
            bottlesNum = bottlesNum - 1;                                                // Decrement the number of bottles by 1

            if (bottlesNum > 0) {                                                       // Check if there are still bottles left
                System.out.println(bottlesNum + " " + word + " of green tea on the wall"); // Print remaining bottles on the wall
            } else {                                                                     // If no bottles are left
                System.out.println("No more bottles of green tea on the wall");           // Print message for no more bottles
            }
        }
    }
}
