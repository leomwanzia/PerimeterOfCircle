# PerimeterOfCircle

Detailed Steps:

Import Scanner:

    import java.util.Scanner; imports the Scanner class to read user input.

Main Method:

    Scanner in = new Scanner(System.in); creates a Scanner object named in to read input from the user.

    System.out.println("Enter the radius of the circle:"); prompts the user to enter the radius.

    double radius = in.nextDouble(); reads the radius from the user.

    double perimeter = calculatePerimeter(radius); calls the calculatePerimeter method to compute the perimeter.

    System.out.println("The perimeter (circumference) of the circle is: " + perimeter); prints the calculated perimeter.

    in.close(); closes the Scanner object to free up resources.

calculatePerimeter Method:

    The formula 2 * Math.PI * radius calculates the perimeter (circumference) of the circle.

The result is stored in the variable perimeter.

The return perimeter; statement returns the computed perimeter to the caller of the method.
