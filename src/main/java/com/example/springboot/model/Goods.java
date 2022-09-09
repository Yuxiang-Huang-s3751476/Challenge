package com.example.springboot.model;

import java.io.Serializable;

/**
 * (Goods)
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = -65616881823296975L;

    private Integer id;

    private String title;

    private String goosdesc;

    private String imagepath;

    private String price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGoosdesc() {
        return goosdesc;
    }

    public void setGoosdesc(String goosdesc) {
        this.goosdesc = goosdesc;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

