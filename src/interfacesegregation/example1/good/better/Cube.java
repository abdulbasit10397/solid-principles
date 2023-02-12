package interfacesegregation.example1.good.better;

public class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}
