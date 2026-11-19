package org.example.e06oop.interfaceedu;

class Whale extends Mommal implements Swim {
    Whale(){
        super("고래","바다");
    }

    @Override
    public String residence() {
        return String.format("%s이/가 %s에 삽니다",this.name,this.residence);
    }
    public String swimming(){
        return String.format("%s이/가 헤엄을 칩니다.",this.name);
    }


}
