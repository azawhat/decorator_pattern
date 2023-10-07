public class Main {
    public static void main(String[] args) {
        Car baseCar = new BasicCar();
        Car gpsCar = new GPS(baseCar);
        Car leatherSeatsCar = new Seats(gpsCar);

        System.out.println("These things are yours " + leatherSeatsCar.getDescription());
        System.out.println("It will cost you $" + leatherSeatsCar.getCost());
    }
}
