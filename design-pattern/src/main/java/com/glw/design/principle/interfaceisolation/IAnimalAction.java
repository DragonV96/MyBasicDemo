package com.glw.design.principle.interfaceisolation;

/**
 * @author : glw
 * @date : 2019/9/16
 * @time : 9:55
 * @Description : 接口隔离原则：动物行为接口，错误示范（狗继承找个接口无法实现fly，鸟继承这个接口无法实现swim，从而造成抽象方法设计冗余）
 */
public interface IAnimalAction {

    void eat();

    void swim();

    void fly();
}
