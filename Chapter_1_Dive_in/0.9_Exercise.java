// Code A

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

//Issues:
//Infinite Loop: The while loop condition x < 10 will always be true because x is never incremented or changed within the loop. This will cause an infinite loop.
//Solution:
//Add an increment statement to x inside the loop so the condition can eventually become false.
//Corrected Code:

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x = x + 1;  // Increment x to avoid infinite loop
        }
    }
}

//Code B

public static void main(String[] args) {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}

//Issues:
//Missing Class Declaration: The code snippet does not declare a class, which is necessary for the program to compile in Java.
//Solution:
//Wrap the main method inside a class declaration.
//Corrected Code:

class Exercise1b {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

// Code C

class Exercise1c {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}

//Issues:
//Improper Placement of while Loop: The while loop is placed directly in the class body, outside of any method. Java does not allow loops or conditional statements to be placed directly inside a class; they must be within a method.
//Solution:
//Place the while loop inside a method, such as main, to ensure it executes properly.
//Corrected Code:

class Exercise1c {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

//Summary of Corrections:
//Code A: Added x = x + 1; to avoid an infinite loop.
//Code B: Wrapped the main method in a class named Exercise1b.
//Code C: Moved the while loop into the main method and wrapped it in a class named Exercise1c.
//Each corrected snippet should now compile and run successfully.
