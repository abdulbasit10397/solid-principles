package interfacesegregation.example1.bad;

/* This is a bad approach because the clients have to implement both area() and volume()
   but there are shapes e.g. square that don't have volume. So the clients will have to
   give a dummy implementation only to remove complication error. This breaks the
   Interface Segregation Principle.
 */
public interface ShapeInterface {
    double area ();
    double volume();
}
