package pl.javastart.task;

public class Vehicle {
    private String name;
    private int fuel;
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

    public double calculateAverageFuelConsumption() {
        return 0;
    }

    public String getInfo() {
        return "\n\nPojazd: " + name + ", ma " + fuel
                + " l paliwa w baku";
    }

    public double calculateRange() {
        return 0;
    }
}