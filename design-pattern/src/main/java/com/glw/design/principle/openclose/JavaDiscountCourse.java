package com.glw.design.principle.openclose;

/**
 * @author : glw
 * @date : 2019/9/6
 * @time : 18:30
 * @Description :
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
