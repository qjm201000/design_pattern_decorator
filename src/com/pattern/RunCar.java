package com.pattern;

/**
 * 会跑的汽车
 */
public class RunCar implements Car{
    @Override
    public void run() {
        System.out.println("汽车会跑");
    }
}
