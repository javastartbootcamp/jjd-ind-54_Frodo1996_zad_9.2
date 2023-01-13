package pl.javastart.task;

public class Truck extends Car {
    private static final double ADDITIONAL_FUEL_CONSUMPTION_PER_EVERY_100_KG_WEIGHT = 0.5;
    private static final double TRUCK_FUEL_CONSUMPTION_WITH_AC = 1.6;
    private double loadWeight;

    public Truck(String name, int fuel, double averageFuelConsumption, boolean airConditioning, double loadWeight) {
        super(name, fuel, averageFuelConsumption, airConditioning);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Dodatkowe obciążenie tira to: " + loadWeight + " kg";
    }

    @Override
    public double calculateAverageFuelConsumption() {
        double fuelConsumption = getAverageFuelConsumption() + calculateAdditionalFuelConsumption();
        if (isAirConditioning()) {
            fuelConsumption += TRUCK_FUEL_CONSUMPTION_WITH_AC;
        }
        return fuelConsumption;
    }

    @Override
    public double calculateRange() {
        double range;
        if (!isAirConditioning()) {
            range = (getFuel() / (getAverageFuelConsumption() + calculateAdditionalFuelConsumption())) * 100;
        } else {
            range = ((getFuel() / (getAverageFuelConsumption() + TRUCK_FUEL_CONSUMPTION_WITH_AC)) * 100);
        }
        System.out.print("Tir spali dodatkowo " + calculateAdditionalFuelConsumption() + "l, a jego zasięg to: ");
        return range;
    }

    private double calculateAdditionalFuelConsumption() {
        return Math.floor(loadWeight / 100) * ADDITIONAL_FUEL_CONSUMPTION_PER_EVERY_100_KG_WEIGHT;
    }
}