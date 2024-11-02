//Consider the following code segment that uses the edu.duke FileResource class. 
//The method .length() calculates how many characters are inside a string. For example, for the string "puppy", .length() would calculate a value of 5. 
//We will learn more about strings later in this course.
  
FileResource f = new FileResource("words.txt");
for (String g : f.lines()) {
  
  if (g.length() > 5) {
    System.out.println(g);
  }
}   

//Suppose the file words.txt contains the following lines:

//cat

//elephant

//monkey

//tiger

//lion

//Which one of the following would be the output from this code segment?

//Hint: Be sure to review the documentation for FileResource if you do are not sure what this class does or what methods it contains: 
//http://www.dukelearntoprogram.com/course2/doc/


A) elephant
   monkey
  
B) cat
   tiger
   lion
  
C) elephant 
   monkey 
   tiger
  
D) cat
   elephant
   monkey
   tiger
   lion


