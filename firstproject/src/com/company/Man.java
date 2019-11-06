package com.company;

import java.util.Objects;

public class Man{
         String name ;
        int age;
        public Man(String name, int age){
        this.name = name;
        this.age = age;
        }
public void eat() {
    System.out.println(name + " может кушать");
    }

public void walk() {
    System.out.println(name + " может гулять");
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Man man = (Man) o;
    return age == man.age &&
            name.equals(man.name);
}

@Override
public int hashCode() {
    return Objects.hash(name, age);
}

@Override
public String toString() {
    return "Man{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
}
}
