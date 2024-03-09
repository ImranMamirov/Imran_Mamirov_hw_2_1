final class Car extends CarModel{
    private String carModel;
    private int yearOfRelease;

    public Car(int factoryName, String location, CarType carType, Engine engine, String carModel, int yearOfRelease) {
        super(factoryName, location, carType, engine);
        this.carModel = carModel;
        this.yearOfRelease = yearOfRelease;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getInfo() {
        return super.getInfo() +
                "\nCar model: " + carModel +
                "\nYear of release: " + yearOfRelease;
    }
}
