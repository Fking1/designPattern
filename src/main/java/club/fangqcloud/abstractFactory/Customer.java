package club.fangqcloud.abstractFactory;

public class Customer {
    public static void main(String[] args){
        CarFactory bmw = new BmwFactory();
        bmw.produceTruck().run();
        bmw.produceSaloon().run();

        CarFactory aodi = new AodiFactory();
        aodi.produceTruck().run();
        aodi.produceSaloon().run();
    }
}
