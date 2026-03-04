import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(New instanceof ElectricCar tesla);
        inventory.add(New instanceof Vehicle ford);
        
        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        for(Vehicle x: inventory)
        {
            if(x instanceof ElectricCar)
            {
                if((x).getBattery()<100)
                {
                    x.charge();
                }
            }
        }

        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
    }
}
