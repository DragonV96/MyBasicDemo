package com.glw.design.principle.open_close;

/**
 * @author : glw
 * @date : 2019/9/6
 * @time : 15:28
 * @Description : 开闭原则：java课程类
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
