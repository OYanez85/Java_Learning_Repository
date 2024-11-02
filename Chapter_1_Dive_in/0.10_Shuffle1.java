class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;                         // Initialize x to 3

        while (x > 0) {                    // Loop while x is greater than 0
            if (x > 2) {
                System.out.print("a");     // Print "a" when x is 3
            }

            if (x == 2) {
                System.out.print("b c");   // Print "b c" when x is 2
            }

            if (x == 1) {
                System.out.print("d");     // Print "d" when x is 1
            }

            x = x - 1;                     // Decrement x by 1
            System.out.print("-");         // Print "-" after each iteration
        }
    }
}
