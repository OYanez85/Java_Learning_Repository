// Consider the Thing class shown below.
public class Thing {               // Define a public class named Thing
  
  private int a;                   // Declare a private integer instance variable a
  
  public Thing(int x) {            // Define a constructor that takes an integer x
    a = x;                         // Initialize the instance variable a with the value of x
  }
  
  public int geta() {              // Define a public method named geta that returns an integer
    return a;                      // Return the value of the instance variable a
  }
  
  public void combine(Thing y) {   // Define a public method named combine that takes a Thing object y
    a = a + y.geta();              // Add the value of y's a (accessed via y.geta()) to this object's a
  }
}

// And consider the following code segment that uses the Thing class.

Thing f = new Thing(6);
Thing g = new Thing(8);
f.combine(g);
System.out.println(f.geta());
System.out.println(g.geta());

// What is printed when this code is executed?
A) 14
    8
B)  6 
   14
C)  6
    8
D) 14
   14
