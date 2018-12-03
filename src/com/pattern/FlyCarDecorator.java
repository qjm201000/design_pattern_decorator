package com.pattern;

/**
 * 会飞的汽车
 */
public class FlyCarDecorator extends Decorator{
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        this.car.run();
        this.run1();
    }

    private void run1(){
        System.out.println("还会飞");
    }
}
