package org.example.e06oop;

public class MainOOP {
    public static void main(String[] args) {
        Whale whale = new Whale(); // <- 인스턴스화
        whale.swimming(whale.name);
        FlyingFish flyingfish = new FlyingFish();
        System.out.println(flyingfish.name);
        System.out.println(Whale.age); // 클래스 변수는 클래스명으로 호출할수있다

        AccessModifier accessModifier = new AccessModifier();

        accessModifier.fnPublic();
        accessModifier.fnProtected();

        // 오버로딩
        // 메소드의 시그니처가 다르거나 , 동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println(OverLoadingOOP.add(1,2));
        System.out.println(OverLoadingOOP.add(4));
    }
}
