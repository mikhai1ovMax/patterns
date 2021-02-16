package com.mikhai1ovmax.behavioral.mememto;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(new String[]{"fish", "meat", "milk"});
        Archive archive = new Archive();
        System.out.println(shop);
        archive.setSave(shop.save());
        shop.setAssortment(new String[]{"eggs", "vine"});
        System.out.println(shop);
        shop.load(archive.getSave());
        System.out.println(shop);
    }
}
