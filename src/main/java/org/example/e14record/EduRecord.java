package org.example.e14record;

public record EduRecord(
        // 내부적으로 private 타입으로 만들어주고 상수로도 만들어주고 getter도 알아서 만들어준다
        String name,
        int age
) {
}


// 기존 문법
// public class EduRecord {
//     private final String name;
//     private final int age;
//
//     public EduRecord(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//
//     public String getName(){
//         return this.name;
//     }
//
//     public int getAge() {
//         return age;
//     }
// }
