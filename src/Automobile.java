public class Automobile extends Transport {

    public Automobile(String name) {
        super(name);
    }

    @Override
    public void speedUp() {
        System.out.println(getName()+" 120km");

    }
}
