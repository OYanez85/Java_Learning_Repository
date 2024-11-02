public class Point { // Defines a public class named 'Point' that can be accessed from anywhere

    private int x; // Declares a private integer field 'x' to store the x-coordinate of the point
    private int y; // Declares a private integer field 'y' to store the y-coordinate of the point

    public Point(int startx, int starty) { // Constructor for the 'Point' class, takes two integers as parameters
        x = startx; // Initializes the 'x' field with the value of 'startx' parameter
        y = starty; // Initializes the 'y' field with the value of 'starty' parameter
    }

    public int getX() { return x; } // Public method to access the value of 'x' field
    public int getY() { return y; } // Public method to access the value of 'y' field

    public double distance(Point otherPt) { // Method to calculate the distance between this point and another point
        int dx = x - otherPt.getX(); // Calculates the difference in x-coordinates between this point and 'otherPt'
        int dy = y - otherPt.getY(); // Calculates the difference in y-coordinates between this point and 'otherPt'
        return Math.sqrt(dx * dx + dy * dy); // Returns the distance using the Pythagorean theorem
    }

    public static void main(String[] args) { // Main method, the entry point for the program
        Point p1 = new Point(3, 4); // Creates a new 'Point' object 'p1' with coordinates (3, 4)
        Point p2 = new Point(6, 8); // Creates a new 'Point' object 'p2' with coordinates (6, 8)
        System.out.println(p1.distance(p2)); // Prints the distance between 'p1' and 'p2' to the console
    }
}
