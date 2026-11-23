package org.example.e09generics;

public class Box <T> {
    // 제너릭스의 타입 파라미터는 관습적으로 대문자1자
    public T arr;

    public Box(T arr){
        // 타입이 객체 타입인 T라서 선언할때 객체형식으로 넣어야함
        this.arr = arr;
    }



}
