public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a;
  }
  
  public void print() {
    int b = 4;System.out.println(geta() + " " + b);
  }
}
