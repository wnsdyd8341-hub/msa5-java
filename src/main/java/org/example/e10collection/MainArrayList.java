package org.example.e10collection;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        // ArrayList에 없는 메소드를 쓸때 불편해서 List로 만들어줌 (다형성)
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1.get(0)); // 0번 인덱스 값 가져옴
        System.out.println(list1.size());
        list1.forEach((i)->{
            System.out.println(i);
        });
        list1.remove(0);

        for(Integer i : list1){
            System.out.println(i);
        }
    }
}
