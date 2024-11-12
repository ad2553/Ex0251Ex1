public class Motorcycle extends Vehicle
{
    @Override
    public void start() {
        System.out.println("Turn the right handle downwards");
    }
    @Override
    public void stop() {
        System.out.println("Put one leg down");
    }
    @Override
    public double accelerate() {
        return 3;
    }
}