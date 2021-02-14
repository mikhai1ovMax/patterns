package com.mikhai1ovmax.structural.decorator;

public class RegionalMinister extends MinisterDecorator{

    public RegionalMinister(Minister minister) {
        super(minister);
    }

    String ruleRegion(){
        return " rules the region";
    }

    @Override
    public String rule() {
        return  super.rule() + ruleRegion();
    }
}
