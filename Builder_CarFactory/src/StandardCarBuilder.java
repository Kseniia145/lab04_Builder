public class StandardCarBuilder implements CarBuilder {
    private Car.Type type;
    private Car.CarColor color;
    private Engine engine;
    private Wheel wheel;

    @Override
    public void reset() {
        type = null;
        color = null;
        engine = null;
        wheel = null;
    }

    @Override
    public void setType(Car.Type type) {
        this.type = type;
    }

    @Override
    public void setColor(Car.CarColor color) {
        this.color = color;
    }

    @Override
    public void setEngine(int power, int torque, Engine.Fuel fuel, float volume) {
        this.engine = new Engine(power, torque, fuel, volume);
    }

    @Override
    public void setWheel(Wheel.Material material, int diameter) {
        this.wheel = new Wheel(material, diameter);
    }

    @Override
    public Car build() {
        return new Car(type, color, engine, wheel);
    }
}
