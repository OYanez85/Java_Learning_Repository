// Consider the Thing class shown below.
public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a ;
  }
  
  public void combine (Thing y) {
    a = a + y.geta();
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
