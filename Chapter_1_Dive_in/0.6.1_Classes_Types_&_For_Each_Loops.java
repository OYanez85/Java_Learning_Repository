public class Thing {                // Define a public class named Thing
  
  private int a;                    // Declare a private integer variable a
  
  public Thing(int x) {             // Define a constructor for the Thing class that takes an integer x
    a = x;                          // Assign the value of x to the instance variable a
  }
  
  public int geta() {               // Define a public method named geta that returns an integer
    return a;                       // Return the value of the instance variable a
  }
  
  public void print() {             // Define a public method named print with no return type
    int b = 4;                      // Declare a local integer variable b and assign it the value 4
    System.out.println(geta() + " " + b);  // Print the value of a (from geta()) and b, separated by a space
  }
}

