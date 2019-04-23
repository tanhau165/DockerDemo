package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "product", schema = "mysql_product_db")
public class Product {

    private String code;
    private String name;
    private  int price;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }


    @Basic
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Basic
    @Column(name="price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
