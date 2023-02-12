package interfacesegregation.example1.good.better;

public class Square implements ShapeInterface, ManageShapeInterface{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area();
    }

}
