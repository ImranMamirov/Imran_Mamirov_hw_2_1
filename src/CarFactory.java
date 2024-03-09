public class CarFactory {
    private int factoryId;
    private String location;

    public CarFactory(int factoryName, String location) {
        this.factoryId = factoryName;
        this.location = location;
    }

    public int getFactoryName() {
        return factoryId;
    }

    public String getLocation() {
        return location;
    }
}
