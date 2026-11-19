package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingFish = new FlyingFish();

        Whale whale = new Whale();
        System.out.println(whale.residence());
    }
}
