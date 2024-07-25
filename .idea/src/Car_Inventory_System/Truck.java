package Car_Inventory_System;

public class Truck extends Car {

    private double towingCapacity;



    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }


    @Override
    public String getInfo() {
        return "Truck Info: VIN: " + getVinNumber() + ", Make: " + getMake() +
                ", Model: " + getModel() + ", Mileage: " + getMileage() +
                ", Towing Capacity: " + towingCapacity + " lbs";
    }
}
