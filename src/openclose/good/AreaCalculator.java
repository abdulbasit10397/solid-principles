package openclose.good;

/* In this approach, we can add as my new shapes as we want without modifying
   Area calculator class. This approach adheres to the Open Close Principle.
        - The design is closed for modification because AreaCalculator class is complete i.e.
          no reason to change it. It will work for all new shapes.
        - The design is open for extension because to we can create as many shapes classes
          as we want and implement Shape interface and its methods to provide custom implementations
          for each Shape we add.
 */
public class AreaCalculator {
    public double calculateShapeArea (Shape shape) {
        return shape.calculateArea();
    }
}
