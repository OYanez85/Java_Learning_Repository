// Code with Candidate 1

class Test {
    public static void main(String[] args) {      // Main method where program execution begins
        int x = 0;                                // Initialize x to 0
        int y = 0;                                // Initialize y to 0
        while (x < 5) {                           // Loop while x is less than 5
            y = x - y;                            // Update y to the difference between x and y (Candidate code)
            System.out.print(x + "" + y + " ");   // Print the current values of x and y
            x = x + 1;                            // Increment x by 1
        }
    }
}

// Code with Candidate 2

class Test {
    public static void main(String[] args) {      // Main method where program execution begins
        int x = 0;                                // Initialize x to 0
        int y = 0;                                // Initialize y to 0
        while (x < 5) {                           // Loop while x is less than 5
            y = y + x;                            // Update y to the sum of y and x (Candidate code)
            System.out.print(x + "" + y + " ");   // Print the current values of x and y
            x = x + 1;                            // Increment x by 1
        }
    }
}

// Code with Candidate 3

class Test {
    public static void main(String[] args) {      // Main method where program execution begins
        int x = 0;                                // Initialize x to 0
        int y = 0;                                // Initialize y to 0
        while (x < 5) {                           // Loop while x is less than 5
            y = y + 2;                            // Increase y by 2 (Candidate code)
            if (y > 4) {                          // If y is greater than 4
                y = y - 1;                        // Decrease y by 1
            }
            System.out.print(x + "" + y + " ");   // Print the current values of x and y
            x = x + 1;                            // Increment x by 1
        }
    }
}

// Code with Candidate 4

class Test {
    public static void main(String[] args) {      // Main method where program execution begins
        int x = 0;                                // Initialize x to 0
        int y = 0;                                // Initialize y to 0
        while (x < 5) {                           // Loop while x is less than 5
            if (y < 5) {                          // If y is less than 5 (Candidate code)
                x = x + 1;                        // Increment x by 1
                if (y < 3) {                      // If y is less than 3
                    x = x - 1;                    // Decrement x by 1
                }
            }
            y = y + 2;                            // Increment y by 2
            System.out.print(x + "" + y + " ");   // Print the current values of x and y
        }
    }
}
