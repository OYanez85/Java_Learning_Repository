int size = 27;                         // declare an integer variable named 'size' and give it the value 27
String name = "Fido";                  // declare a string variable named 'name' and give it the value "Fido"
Dog myDog = new Dog(name, size);       // declare a new Dog variable 'myDog' and make the new Dog using 'name' and 'size'
x = size - 5;                          // subtract 5 from 27 (value of 'size') and assign it to a variable named 'x'
if (x < 15) myDog.bark(8);             // if x (value of 22) is less than 15, tell the dog to bark 8 times

while (x > 3) {                        // keep looping as long as x is greater than 3...
    myDog.play();                      // tell the dog to play (whatever THAT means to a dog...)
}                                      // this looks like the end of the loop -- everything in { } is done in the loop

int[] numList = {2, 4, 6, 8};          // declare a list of integers variable 'numList', and put 2, 4, 6, 8 into the list
System.out.print("Hello");             // print out "Hello"... probably at the command line
System.out.print("Dog: " + name);      // print out "Dog: Fido" (the value of 'name' is "Fido") at the command line
String num = "8";                      // declare a character string variable 'num' and give it the value "8"
int z = Integer.parseInt(num);         // convert the string of characters "8" into an actual numeric value 8

try {
    readTheFile("myFile.txt");         // try to read a text file named "myFile.txt" (or at least TRY to read the file...)
} catch (FileNotFoundException ex) {   // if the file is not found, this is where you find out
    System.out.print("File not found."); // if the thing we tried failed, print "File not found." at the command line
}                                      // everything in the { } is what to do if the "try" didn’t work



