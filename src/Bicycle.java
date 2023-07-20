public class Bicycle extends Transport{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void speedUp() {
        System.out.println(getName()+" 20 km");
    }
}
