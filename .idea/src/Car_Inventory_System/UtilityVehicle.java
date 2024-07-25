package Car_Inventory_System;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Utility Vehicle Info: VIN: " + getVinNumber() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Mileage: " + getMileage() +
                ", Four-Wheel Drive: " + fourWheelDrive;
    }

}
