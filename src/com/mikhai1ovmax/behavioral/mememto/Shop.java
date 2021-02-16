package com.mikhai1ovmax.behavioral.mememto;

import java.util.Arrays;
import java.util.Date;

public class Shop {
    private String[] assortment;
    private Date date;

    public Shop(String[] assortment) {
        this.assortment = assortment;
        date = new Date();
    }

    public void setAssortment(String[] assortment) {
        this.assortment = assortment;
        date = new Date();
    }

    public Save save() {
        return new Save(assortment);
    }

    public void load(Save save) {
        assortment = save.getAssortment();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "assortment=" + Arrays.toString(assortment) +
                ", date=" + date +
                '}';
    }
}
