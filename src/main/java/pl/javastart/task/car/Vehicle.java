package pl.javastart.task.car;

public class Vehicle {
    private String name;
    protected int fuel;
    private double averageFuelConsumption;

    public Vehicle(String name, int fuel, double averageFuelConsumption) {
        this.name = name;
        this.fuel = fuel;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getInfo() {
        return "\n\nPojazd: " + name + ", ma " + fuel
                + " l paliwa w baku";
    }

    protected double calculateFuelConsumption() {
        return 0;
    }

    protected double calculateRange() {
        return 0;
    }
}