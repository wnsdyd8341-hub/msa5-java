package org.example.e11enum;

public enum Weeks{
    // Enum : 상수의 집합을 편리하게 선언하고 사용하기 위해서 만든 객체
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");

    // enum에서는 상수만 쓸수있다.
    // 값을 바꾸지 못하게 할려고? private로 접근
    private final String krDay;
    // 생성자로 enum 처리를 바꿀수있다
    Weeks(String krDay){this.krDay = krDay;}

    // 값 가져올려고 get을 써줌
    public String getKrDay(){
        return this.krDay;
    }
}
