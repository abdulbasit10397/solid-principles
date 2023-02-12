package liskovsubstitution;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 240;
    }

    @Override
    int getCubicCapacity() {
        return 500;
    }

    boolean sHatchBack () {
        return false;
    }
}
