public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Truck truck = new Truck("SCANIA", 8);
        Bicycle bicycle = new Bicycle("BMX", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(bicycle);

    }
}