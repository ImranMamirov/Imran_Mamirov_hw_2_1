public class CarModel extends CarFactory {
    private CarType carType;
    private Engine engine;

    public CarModel(int factoryName, String location, CarType carType, Engine engine) {
        super(factoryName, location);
        this.carType = carType;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void produce() {
        System.out.println("Producing Engine");
    }
    public void produce(int quantity) {
        System.out.println("Producing: " + quantity);
    }
    public String getInfo() {
        return "Factory: " + getFactoryName() +
                "\nLocation; " + getLocation() +
                "\nType: " + carType +
                "\nEngine: " + engine.getModel();
    }
}
