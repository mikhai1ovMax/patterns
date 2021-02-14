package com.mikhai1ovmax.creational.singleton;

public class Berlin {
    private static int population = 9876543;
    private static String mayor = "Gans";
    private static Berlin berlin = new Berlin();

    private Berlin(){}

    public static void setPopulation(int population) {
        Berlin.population = population;
    }

    public static void setMayor(String mayor) {
        Berlin.mayor = mayor;
    }

    public static void showPopulation() {
        System.out.println(population);
    }

    public static void showMayor() {
        System.out.println(mayor);
    }

    public static Berlin getBerlin() {
        return berlin;
    }
}
