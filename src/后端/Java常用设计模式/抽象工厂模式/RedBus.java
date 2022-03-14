package 后端.Java常用设计模式.抽象工厂模式;

import 后端.Java常用设计模式.简单工厂模式.Vehicle;

/**
 * Created by SachsFang on 2021/7/16 11:05
 */
public class RedBus implements Vehicle {

    @Override
    public String getVehicleSay() {
        return "I am red bus";
    }
}
