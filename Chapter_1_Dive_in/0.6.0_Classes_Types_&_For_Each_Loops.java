public class Mystery {
  
  /**
   * read file of mysterious phrases
   */
   
  public void DoSomething() {
    // initialize instance variables
    FileResource someFile = FileResource("phrases.txt");
    for (String phrase : someFile.lines()){
      System.out.println(phrase);
    }
  }
}

// Which one of the following is the name of a method?

