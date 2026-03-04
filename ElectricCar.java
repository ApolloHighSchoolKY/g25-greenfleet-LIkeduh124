public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        super(model);
        // TODO: Set batteryPercent to 100.0
        batteryPercent = 100.0;
    }

    public double getBattery()
    {
        return batteryPercent;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        super.drive(distance);
        // TODO: Calculate battery loss
        battery -= distance/5;
        
    }

    public void charge() {
        batteryPercent = 100.0;
    }
}
