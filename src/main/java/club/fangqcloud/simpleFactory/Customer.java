package club.fangqcloud.simpleFactory;

/**
 * 客户（消费者）
 */
public class Customer {

    public static void main(String[] args){
//        普通方法生产（创建）汽车（对象）
//        创建了一辆奥迪
//        AodiTruck aodi = new AodiTruck();
//        创建了一辆宝马
//        BmwTruck bmw = new BmwTruck();

//        工厂模式生产汽车
        BmwTruck bmw = (BmwTruck) TruckFactory.produceTurck("宝马");
        bmw.run();

//        新增大众汽车

    }
}
