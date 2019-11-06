package com.company;

import java.util.Objects;

public abstract class Car {

    public void setModel(String model) {
        this.model = model;
    }

    public enum Color {
        white,
        black
    }

    public void setType_of_box(String type_of_box) {
        this.type_of_box = type_of_box;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private String model, type_of_box;
    private int capacity;

    public interface acceleration{
        void acceleration_of_car();
    }

    public void switching() {
        if (type_of_box == "Automation") System.out.println("Переключение коробки передачь происходит автоматически");
        else {
            int i, n = 4;
            for (i = 1; i <= n; i++){
                System.out.println("Переключение на " + i + " передачу");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                model.equals(car.model) &&
                type_of_box.equals(car.type_of_box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type_of_box, capacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type_of_box='" + type_of_box + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
    class BMW extends Car implements Car.acceleration{
        public void acceleration_of_car() {
        System.out.println("Ускорение автомобиля BMW");
        }
    }

    class Mercedez extends Car implements Car.acceleration {
        public void acceleration_of_car() {
            System.out.println("Ускорение автомобиля Mercedez");
        }
    }


