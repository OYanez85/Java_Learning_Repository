import edu.duke.FileResource;  // Import the FileResource class from the edu.duke package

public class HelloWorld {  // Define a public class named HelloWorld
    public void runHello() {  // Define a public method named runHello
        FileResource f;  // Declare a FileResource object named f
        f = new FileResource("file.txt");  // Initialize the FileResource object with "file.txt"
        
        // Loop through each line in the file
        for (String line : f.lines()) {  
            System.out.println(line);  // Print each line to the console
        }
    }
}
