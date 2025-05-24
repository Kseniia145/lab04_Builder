public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new StandardCarBuilder();
        Director director = new Director(builder);

        Car sedan = director.createEconomySedan();
        System.out.println("=== Economy Sedan ===");
        System.out.println(sedan);

        Car suv = director.createLuxurySUV();
        System.out.println("=== Luxury SUV ===");
        System.out.println(suv);
    }
}
