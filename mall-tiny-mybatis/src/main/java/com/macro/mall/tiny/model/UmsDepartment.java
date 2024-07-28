package com.macro.mall.tiny.model;

import java.io.Serializable;

public class UmsDepartment implements Serializable {
    private long id;
    private String name;
    private Integer number;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }



    @Override
    public String toString() {
        return "UmsDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
