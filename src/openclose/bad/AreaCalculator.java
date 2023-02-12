package openclose.bad;

/* Now whenever a new shape will be added in our system, we have to update this class
   and add respective shape's area calculation method. So, the class remains open for
   modification which is not what open close principle suggests  */

public class AreaCalculator {
    public double calculateRectangleArea (Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public double calculateCircleArea (Circle circle) {
        return (22/7) * circle.getRadius() * circle.getRadius();
    }
}

