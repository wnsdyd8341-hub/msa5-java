package org.example.e06oop.polymorphism;

public class Whale extends Mammar{
    public void swimming(){
        System.out.println("고래 헤엄칩니다");
    }
    @Override
    public void birth(){
        System.out.println("고래 출산");
    }
}
