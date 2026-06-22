public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Fiat", 2023, 2);
        Vehicle motorcycle = new Motorcycle("Ducati", 2021);

        car.start();
        motorcycle.start();
    }
}

abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён. Количество дверей: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}
