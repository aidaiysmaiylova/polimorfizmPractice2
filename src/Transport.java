public class Transport {
private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speedUp(){
        System.out.println(name+ " is ride");

    }
}
