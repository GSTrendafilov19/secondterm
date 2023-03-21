public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "ML", 15);
        Car car2 = new Car("Opel", "Astra", 20);
        Car car3 = new Car("VW", "Golf", 10);
        Car car4 = new Car("VW", "Golf", 12);

        Garage garage = new Garage(car1, car2, car3);

        for (Car car : garage) {
            System.out.println(car.getBrand());
        }
    }
}
