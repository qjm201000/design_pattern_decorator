package com.pattern;

/**
 * 装饰基类，实现和Car相同的方法
 */
public abstract class Decorator implements Car{
    protected Car car;
    public Decorator(Car car){
        this.car =car;
    }
}
