int myFunction(int x, int y) {  // Define a function called myFunction that takes two integers, x and y, as parameters
    int z = 2 * x - y;          // Calculate 2 times x minus y, and store the result in z
    return z * x;               // Return the value of z multiplied by x
}

int f(int n) {                  // Define a function called f that takes an integer n as a parameter
    return 3 + myFunction(n, n + 1);  // Call myFunction with n and n + 1 as arguments, add 3 to the result, and return it
}

int g() {                       // Define a function called g that takes no parameters
    int a;                      // Declare an integer variable a
    a = myFunction(3, 7);       // Call myFunction with 3 and 7 as arguments and assign the result to a
    int b = f(a * a);           // Calculate a squared (a * a), call f with that result as an argument, and store it in b
    return b;                   // Return the value of b
}
