package com.mikemyzhao.springbootdemo.entity;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/3 16:41
 * @Description:
 */
public class Product {
    private String name;
    private int price;
    private int inStock;

    public Product() {
    }

    public Product(String name, int price, int inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
