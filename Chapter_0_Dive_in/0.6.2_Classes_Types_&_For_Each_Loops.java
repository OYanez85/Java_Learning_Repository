public class Thing {                // Define a public class named Thing
  
  private int a;                    // Declare a private integer instance variable a
  
  public Thing(int x) {             // Define a constructor for the Thing class that takes an integer x
    a = x;                          // Initialize the instance variable a with the value of x
  }
  
  public int geta() {               // Define a public method named geta that returns an integer
    return a;                       // Return the value of the instance variable a
  }
}
// And consider the following code segment that uses the class Thing.

Thing f = new Thing(3);   // Create a new Thing object with a = 3 and assign it to the reference variable f
Thing g = new Thing(5);   // Create another new Thing object with a = 5 and assign it to the reference variable g
Thing h = f;              // Set h to refer to the same Thing object as f (the one with a = 3)
Thing j = h;              // Set j to refer to the same Thing object as h (also the one with a = 3)

// How many Thing objects are created?
2
