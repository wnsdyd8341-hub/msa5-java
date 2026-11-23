package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
        Weeks monday = Weeks.MONDAY;
        System.out.println(monday);
        System.out.println(monday.ordinal()); // 0이 출력 enum의 인덱스값? 비슷한거
        // ordinal 내부 연산로직에는 쓰면 안된다 .  순서보장이 안되어있어서 에러가 날 확률이 높다
        System.out.println(monday.name());
        System.out.println(monday.getKrDay());

        Weeks sunday = Weeks.SUNDAY;
        System.out.println(sunday.getKrDay());
    }
}
