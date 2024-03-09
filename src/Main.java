public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V6 ");
        CarModel carModel = new CarModel(1, "America", CarType.HATCHBACK, engine);
        System.out.println(carModel.getInfo());
        carModel.produce();
        carModel.produce(5);

        System.out.println("------------------");
        Engine engine1 = new Engine("V12 ");
        Car car = new Car(2, "Germany", CarType.SEDAN, engine1, "Mercedes GT63S", 2016);
        System.out.println(car.getInfo());
        carModel.produce();
        carModel.produce(10);

        System.out.println("------------------");
        Engine engine2 = new Engine("V10 ");
        Car car2 = new Car(3, "Germany", CarType.SUV, engine2, "Mercedes G63", 2020);
        System.out.println(car2.getInfo());
        carModel.produce();
        carModel.produce(20);

    }
}