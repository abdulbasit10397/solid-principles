package interfacesegregation.example1.good.justgood;

/* Now, this approach is comparatively better because now volume() is in a SolidShapeInterface
   and ShapeInterface clients don't need to worry about volume (un-necessarily). But a drawback
   here is that we are specifying the shape i.e. Cube.
 */
public class Cube implements ShapeInterface, SolidShapeInterface{

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
