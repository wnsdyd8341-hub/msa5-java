package org.example.e06oop.inheritance;

public class Animal {
    protected String name;
    protected String residence; // 사는곳

    public Animal(String name, String residence){
        this.name = name;
        this.residence = residence;
        System.out.println("동물생성자");
    }

    public String breath(){
        // String.format <- printf랑 같은건데 값을 반환함
        return String.format("%s이/가 숨을 쉽니다\n",this.name);
    }

    public String leaving(){
        return String.format("%s가 %s에서 삽니다\n",this.name,this.residence);
    }
}
