package org.example.e13methodreference;

import java.util.Arrays;
import java.util.List;

public class MainMethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "둘리", "또치");

        // 람다식 출력
        list.forEach(name-> System.out.println(name));

        // 메소드 참조
        list.forEach(System.out::println);
    }
}
