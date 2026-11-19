package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;

public class MainOOP {
    public static void main(String[] args) {


        AccessModifier accessModifier = new AccessModifier();

        accessModifier.fnPublic();
        accessModifier.fnProtected();

        // 오버로딩
        // 메소드의 시그니처가 다르거나 , 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println(OverLoadingOOP.add(1,2));
        System.out.println(OverLoadingOOP.add(4));

        ConstructOOP coop = new ConstructOOP();
        System.out.println(coop.age);
        System.out.println(coop.name);

        // 상속
        FlyingFish flyingFish = new FlyingFish("날치","바다");
        // System.out.println(flyingFish.breath());


    }
}
