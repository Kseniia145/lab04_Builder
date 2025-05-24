public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car createEconomySedan() {
        builder.reset();
        builder.setType(Car.Type.Sedan);
        builder.setColor(Car.CarColor.White);
        builder.setEngine(90, 120, Engine.Fuel.Petrol, 1.2f);
        builder.setWheel(Wheel.Material.Steel, 14);
        return builder.build();
    }

    public Car createLuxurySUV() {
        builder.reset();
        builder.setType(Car.Type.SUV);
        builder.setColor(Car.CarColor.Black);
        builder.setEngine(200, 320, Engine.Fuel.Diesel, 3.0f);
        builder.setWheel(Wheel.Material.Forged, 20);
        return builder.build();
    }
}
