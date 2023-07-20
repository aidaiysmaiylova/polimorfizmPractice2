public class Main {
    public static void main(String[] args)
    {
        Transport automobile=new Automobile("Tesla");
Transport bicycle=new Bicycle("BVV");
Transport[]transports={automobile,bicycle};
for(Transport transport:transports){
    transport.speedUp();
}
    }
}