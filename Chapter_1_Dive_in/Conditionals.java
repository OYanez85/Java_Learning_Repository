int f(int x, int y) {            // Define a function f that takes two integers, x and y, as parameters
    if (x < y) {                 // Check if x is less than y
        System.out.println("x < y");  // Print "x < y" to the console if the condition is true
        return y + x;            // Return the sum of y and x if x < y
    } else {                     // If x is not less than y (x >= y)
        System.out.println("x >= y"); // Print "x >= y" to the console
        if (x > 8) {             // Check if x is greater than 8
            return y + 7;        // Return y + 7 if x > 8
        }
    }
    return x - 2;                // If none of the above conditions are met, return x - 2
}

int g() {                        // Define a function g that takes no parameters
    int a = f(3, 4);             // Call f with arguments 3 and 4, and assign the result to a
    int b = f(a, 5);             // Call f with arguments a and 5, and assign the result to b
    return b;                    // Return the value of b
}
