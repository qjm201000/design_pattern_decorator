package com.pattern;

public class Main {
    public static void main(String[] args) {
        Car runCar = new RunCar();//会跑的汽车
        runCar.run();
        System.out.println("----------------------------");

        Car flyRunCar = new FlyCarDecorator(runCar);//装饰会跑的汽车，变成会跑又会飞的汽车
        flyRunCar.run();
        System.out.println("----------------------");

        Car swimFlyRunCar = new SwimCarDecorator(flyRunCar);//装饰会跑会飞的汽车，变成会跑会飞会游的汽车
        swimFlyRunCar.run();
    }
}
