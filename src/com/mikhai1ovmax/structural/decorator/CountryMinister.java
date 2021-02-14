package com.mikhai1ovmax.structural.decorator;

public class CountryMinister extends MinisterDecorator{

    public CountryMinister(Minister minister) {
        super(minister);
    }

    String ruleCountry(){
        return " rules the country";
    }

    @Override
    public String rule() {
        return super.rule() + ruleCountry();
    }
}
