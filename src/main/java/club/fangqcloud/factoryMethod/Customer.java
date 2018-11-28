package club.fangqcloud.factoryMethod;

public class Customer {
    public static void main(String[] args){
        TruckFactory bmw = (TruckFactory) new BmwTruckFactory();
        bmw.produceTruck().run();

        TruckFactory aodi = (TruckFactory) new AodiTruckFactory();
        aodi.produceTruck().run();
    }
}
