package com.pattern;

/**
 * 会游的汽车
 */
public class SwimCarDecorator extends Decorator{
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        this.car.run();
        this.run1();
    }

    private void run1(){
        System.out.println("还会游");
    }
}
