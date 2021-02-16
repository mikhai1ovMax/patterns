package com.mikhai1ovmax.behavioral.mememto;

import java.util.Date;

public class Save {
    private final String[] assortment;
    private final Date date;

    public Save(String[] assortment) {
        this.assortment = assortment;
        this.date = new Date();
    }

    public String[] getAssortment() {
        return assortment;
    }

    public Date getDate() {
        return date;
    }
}
