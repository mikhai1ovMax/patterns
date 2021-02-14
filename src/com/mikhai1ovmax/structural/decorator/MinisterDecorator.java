package com.mikhai1ovmax.structural.decorator;

public class MinisterDecorator implements Minister{
    Minister minister;

    public MinisterDecorator(Minister minister) {
        this.minister = minister;
    }

    @Override
    public String rule() {
       return  minister.rule();
    }
}
