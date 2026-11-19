package org.example.e06oop.abstractclass;

public class Monkey extends Mammal{

    @Override
    public String leaving() {
        return String.format("%s가 %s에 삽니다",super.name,super.residence);
    }
}

