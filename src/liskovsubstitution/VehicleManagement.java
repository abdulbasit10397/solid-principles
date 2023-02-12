package liskovsubstitution;

public class VehicleManagement {

    public static void main(String[] args) {
        /* This is what the Liskov substitution means that we are replacing the subclass
           objects, and it still works correctly */

        Vehicle vehicle = new Car();
        vehicle.getSpeed();
        vehicle = new Bus();
        vehicle.getCubicCapacity();
    }
}
