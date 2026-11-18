package org.example.e06oop;

public class Whale {
    // 필드 : 변수가 선언되는 공간
    public String name = "고래"; // 인스턴스 변수
    public static int age = 20; // 클래스 변수


    // 메소드
    public void swimming (String n){
        String swi = "수영"; // 지역변수
        System.out.printf("%s가 헤엄칩니다.\n",n);
    }


}
