class Seats implements Car {
    private Car car;

    public Seats(Car car) {
        this.car = car;
    }
    public String getDescription() {
        return car.getDescription() + ", best seats ever";
    }
    public double getCost() {
        return car.getCost() + 1000.0;
    }
}