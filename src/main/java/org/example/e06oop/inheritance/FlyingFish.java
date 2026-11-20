package org.example.e06oop.inheritance;

 public class FlyingFish extends Animal{

    public FlyingFish(String name, String residence){
        super(name,residence);
        System.out.println("날치생성자");
    }
    public String flying(){
        return String.format("%s이/가 날아갑니다\n",super.name);
    }

    // 오버라이딩 : 리턴타입 , 파라미터 , 메소드이름이 동일해야하고 내용만 다르게 재정의
    @Override
    public String breath(){
        System.out.printf("%s가 숨을 쉽니다 \n",super.name);
        return String.format("%s이/가 숨을 쉽니다\n",super.name);
    }
}
