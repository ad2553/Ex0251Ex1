public class Bicycle extends Vehicle
{
    @Override
    public void start() {
        System.out.println("pedal clockwise");
    }
    @Override
    public void stop() {
        System.out.println("pedal counter clockwise");
    }
    @Override
    public double accelerate() {
        return 1;
    }
}