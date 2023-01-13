package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Truck[] trucks = new Truck[3];

        cars[0] = new Car("Audi", 20, 4.2, true);
        cars[1] = new Car("Golf", 10, 10, false);
        trucks[0] = new Truck("Man", 100, 9.5, false, 100);
        trucks[1] = new Truck("Volvo", 100, 8.4, true, 200);
        trucks[2] = new Truck("Scania", 150, 14, false, 250);

        System.out.println(cars[0].getInfo());
        System.out.printf("%.2f", cars[0].calculateRange());
        System.out.println(cars[1].getInfo());
        System.out.printf("%.2f", cars[1].calculateRange());
        System.out.println(trucks[0].getInfo());
        System.out.printf("%.2f", trucks[0].calculateRange());
        System.out.println(trucks[1].getInfo());
        System.out.printf("%.2f", trucks[1].calculateRange());
        System.out.println(trucks[2].getInfo());
        System.out.printf("%.2f", trucks[2].calculateRange());
    }
}