package liskovsubstitution;

public class Bus extends Vehicle{
    @Override
    int getSpeed() {
        return 160;
    }

    @Override
    int getCubicCapacity() {
        return 1500;
    }

    public String getEmergencyExitLocation () {
        return "Near Backdoor";
    }
}
