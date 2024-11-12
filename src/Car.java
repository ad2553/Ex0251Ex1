public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("press the gas pedal");
    }
    @Override
    public void stop() {
        System.out.println("press break pedal");
    }
    @Override
    public double accelerate() {
        return 2;
    }
}