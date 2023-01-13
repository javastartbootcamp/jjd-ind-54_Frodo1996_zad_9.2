package pl.javastart.task;

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
    public double calculateAverageFuelConsumption() {
        double avgConsumption = getAverageFuelConsumption();
        if (airConditioning) {
            avgConsumption += CAR_FUEL_CONSUMPTION_WITH_AC;
        }
        return avgConsumption;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ". Czy klimatyzacja w aucie jest włączona? " + isAirConditioning()
                + "\nŚrednie spalanie auta na 100km to: " + calculateAverageFuelConsumption() + " litrów.";
    }

    @Override
    public double calculateRange() {
        double range = getFuel() / calculateAverageFuelConsumption() * 100;
        System.out.print("Zasięg auta to: ");
        return range;
    }
}