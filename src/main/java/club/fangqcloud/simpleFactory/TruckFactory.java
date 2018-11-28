package club.fangqcloud.simpleFactory;
//生产车的工厂类
public class TruckFactory {
    public static Truck produceTurck(String message){
//        if(message.equals("宝马")){
//            return new BmwTruck();
//        }
//        else if(message.equals("奥迪")){
//            return new AodiTruck();
//        }
//        else{
//            return null;
//        }


        switch(message){
            case "宝马":
                return new BmwTruck();
            case "奥迪":
                return new AodiTruck();
            default:
                return null;
        }


    }
}
