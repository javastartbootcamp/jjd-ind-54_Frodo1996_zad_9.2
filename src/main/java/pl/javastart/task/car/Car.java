package pl.javastart.task.car;

public class Car extends Vehicle {
    private static final double CAR_FUEL_CONSUMPTION_WITH_AC = 0.8;
    private boolean airConditioning;

    public Car(String name, int fuel, double averageFuelConsumption, boolean airConditioning) {
        super(name, fuel, averageFuelConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ". Czy klimatyzacja w aucie jest włączona? " + isAirConditioning()
                + "\nŚrednie spalanie auta na 100km to: " + calculateFuelConsumption() + " litrów."
                + "\nZasięg auta to: " + calculateRange() + "km.";
    }

    @Override
    protected double calculateFuelConsumption() {
        double avgConsumption = getAverageFuelConsumption();
        if (airConditioning) {
            avgConsumption += CAR_FUEL_CONSUMPTION_WITH_AC;
        }
        return avgConsumption;
    }

    @Override
    protected double calculateRange() {
        return getFuel() / calculateFuelConsumption() * 100;
    }
}