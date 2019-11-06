package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args){
        // Инициализация людей которые могут водить машину
        Man man = new Man("Vanea", 40);
        Man man1 = new Man("Alex", 35);
        // Вывод с помощью StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append(man.toString()).append("  ").append(man1.toString());
        System.out.println(sb);
        man.eat();
        man.walk();
        //Инициализация двух машин
        Car BMW = new BMW();
        BMW.setModel("BMW");
        Car.Color cr = Car.Color.black;
        BMW.setType_of_box("Automation");
        BMW.setCapacity(4);
        Car Mercedez = new Mercedez();
        Car.Color cr1 = Car.Color.white;
        Mercedez.setModel("Mercedez");
        Mercedez.setType_of_box("Manual");
        Mercedez.setCapacity(4);

        // Использование StringBuilder
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(BMW.toString()).append("color  " + cr).append("   ").append(BMW.hashCode()).append("   ").append(BMW.equals(1)).append("    ");
        sBuilder.append(Mercedez.toString()).append("color  " + cr1).append("   ").append(Mercedez.hashCode()).append("   ").append(Mercedez.equals(1));
        System.out.println(sBuilder);
        System.out.println(man.toString() + " Его машина " + BMW.toString() + "color  " + cr);
        System.out.println(man1.toString() + " Его машина " + Mercedez.toString() + "color  " + cr1);
        // Инициализация пассажиров
        Passager Kate = new Passager("Kate", 20);
        Passager Pasha = new Passager("Pasha", 18);
        Passager Egor = new Passager("Egor", 16);
        Passager Vasea = new Passager("Vasea", 30);
        Passager Masha = new Passager("Masha", 26);
        Passager Igori = new Passager("Igori", 25);


        System.out.println(" Первая машина " + BMW.toString() + " Водитель машины " + man.toString() + " Пассажиры машины " + Kate + Pasha + Egor);
        ((com.company.BMW) BMW).acceleration_of_car();
        BMW.switching();


        System.out.println(" Первая машина " + Mercedez.toString() + " Водитель машины " + man1.toString() + " Пассажиры машины " + Vasea + Masha + Igori);
        ((com.company.Mercedez) Mercedez).acceleration_of_car();
        Mercedez.switching();
    }
}

