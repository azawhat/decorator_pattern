class GPS implements Car {
    private Car car;

    public GPS(Car car) {
        this.car = car;
    }
    public String getDescription() {
        return car.getDescription() + ", gps";
    }
    public double getCost() {
        return car.getCost() + 1000.20;
    }
}