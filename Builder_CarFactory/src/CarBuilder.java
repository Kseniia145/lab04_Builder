public interface CarBuilder {
    void reset();
    void setType(Car.Type type);
    void setColor(Car.CarColor color);
    void setEngine(int power, int torque, Engine.Fuel fuel, float volume);
    void setWheel(Wheel.Material material, int diameter);
    Car build();
}
