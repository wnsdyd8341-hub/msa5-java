package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box <int[]> boxIntArr = new Box<>(new int[4]);
        Box <String[]> boxStringArr = new Box<>(new String[3]);

        // 제네릭스를 제한
        BoxRestrict<Tv> boxRestrict = new BoxRestrict<>();
        BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
        BoxRestrict<App> boxRestrict3 = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict4 = new BoxRestrict<>();  제한 때문에 타입을 쓸수없다.

    }
}
