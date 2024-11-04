import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    
    // Method to calculate the perimeter of the given shape
    public double getPerimeter (Shape s) {
        double totalPerim = 0.0; // Initialize total perimeter to 0
        Point prevPt = s.getLastPoint(); // Get the last point of the shape as the starting point

        // Loop through all the points in the shape
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt); // Calculate distance between prevPt and currPt
            totalPerim = totalPerim + currDist; // Add the distance to the total perimeter
            prevPt = currPt; // Update prevPt to be the current point for the next iteration
        }

        return totalPerim; // Return the calculated total perimeter
    }

    // Method to return the number of points in the shape
    public int getNumPoints (Shape s) {
        int numPoints = 0; // Initialize point counter
        for (Point currPt : s.getPoints()) {
            numPoints++; // Increment the counter for each point in the shape
        }
        return numPoints; // Return the total number of points
    }

    // Method to calculate the average side length of the shape
    public double getAverageLength(Shape s) {
        double perimeter = getPerimeter(s); // Get the total perimeter of the shape
        int numSides = getNumPoints(s); // Get the number of points (or sides)
        return perimeter / numSides; // Calculate and return the average side length
    }

    // Method to find the largest side in the shape
    public double getLargestSide(Shape s) {
        double largestSide = 0.0; // Initialize largest side length
        Point prevPt = s.getLastPoint(); // Get the last point of the shape

        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt); // Calculate distance between prevPt and currPt
            if (currDist > largestSide) {
                largestSide = currDist; // Update the largest side if current distance is larger
            }
            prevPt = currPt; // Update prevPt to be the current point for the next iteration
        }

        return largestSide; // Return the largest side length
    }

    // Method to find the largest X coordinate in the shape
    public double getLargestX(Shape s) {
        double largestX = Double.NEGATIVE_INFINITY; // Initialize the largest X with a very small value

        for (Point currPt : s.getPoints()) {
            double currX = currPt.getX(); // Get the X coordinate of the current point
            if (currX > largestX) {
                largestX = currX; // Update the largest X if current X is larger
            }
        }

        return largestX; // Return the largest X coordinate
    }

    // Method to find the largest perimeter among multiple files
    public double getLargestPerimeterMultipleFiles() {
        double largestPerimeter = 0.0; // Initialize largest perimeter
        DirectoryResource dr = new DirectoryResource(); // Allow user to select multiple files

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f); // Open the file
            Shape s = new Shape(fr); // Create shape from the file
            double currPerimeter = getPerimeter(s); // Get the perimeter of the shape

            if (currPerimeter > largestPerimeter) {
                largestPerimeter = currPerimeter; // Update the largest perimeter if current one is larger
            }
        }

        return largestPerimeter; // Return the largest perimeter found
    }

    // Method to return the name of the file with the largest perimeter
    public String getFileWithLargestPerimeter() {
        File temp = null; // Temporary file to store the file with the largest perimeter
        double largestPerimeter = 0.0; // Initialize the largest perimeter
        DirectoryResource dr = new DirectoryResource(); // Allow user to select multiple files

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f); // Open the file
            Shape s = new Shape(fr); // Create shape from the file
            double currPerimeter = getPerimeter(s); // Get the perimeter of the shape

            if (currPerimeter > largestPerimeter) {
                largestPerimeter = currPerimeter; // Update the largest perimeter
                temp = f; // Store the file with the largest perimeter
            }
        }

        return temp.getName(); // Return the name of the file with the largest perimeter
    }

    // Method to test and print the perimeter of a shape
    public void testPerimeter () {
        FileResource fr = new FileResource(); // Open file for reading
        Shape s = new Shape(fr); // Create shape from the file
        double length = getPerimeter(s); // Get the perimeter of the shape
        System.out.println("perimeter = " + length); // Print the perimeter

        int numPoints = getNumPoints(s); // Get the number of points in the shape
        System.out.println("Number of points = " + numPoints); // Print the number of points

        double averageLength = getAverageLength(s); // Get the average side length
        System.out.println("Average side length = " + averageLength); // Print the average side length

        double largestSide = getLargestSide(s); // Get the largest side
        System.out.println("Largest side = " + largestSide); // Print the largest side

        double largestX = getLargestX(s); // Get the largest X value
        System.out.println("Largest X = " + largestX); // Print the largest X value
    }
    
    // Method to test perimeter across multiple files
    public void testPerimeterMultipleFiles() {
        double largestPerimeter = getLargestPerimeterMultipleFiles(); // Get the largest perimeter across files
        System.out.println("Largest perimeter from multiple files = " + largestPerimeter); // Print the largest perimeter
    }

    // Method to test and print the file with the largest perimeter
    public void testFileWithLargestPerimeter() {
        String fileName = getFileWithLargestPerimeter(); // Get the file with the largest perimeter
        System.out.println("File with largest perimeter = " + fileName); // Print the file name
    }

    // Method to create a sample triangle for testing
    public void triangle(){
        Shape triangle = new Shape(); // Create a new shape (triangle)
        triangle.addPoint(new Point(0,0)); // Add point (0,0)
        triangle.addPoint(new Point(6,0)); // Add point (6,0)
        triangle.addPoint(new Point(3,6)); // Add point (3,6)
        for (Point p : triangle.getPoints()){
            System.out.println(p); // Print the points of the triangle
        }
        double peri = getPerimeter(triangle); // Calculate the perimeter
        System.out.println("perimeter = " + peri); // Print the perimeter
    }

    // Method to print names of all selected files
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource(); // Allow user to select multiple files
        for (File f : dr.selectedFiles()) {
            System.out.println(f); // Print the name of each file
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner(); // Create an instance of the runner
        pr.testPerimeter(); // Test perimeter for a shape
    }
}
