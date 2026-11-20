package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        // 인스턴스 자동으로 생성해준다
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime targetDate = LocalDateTime.of(2026,11,1,11,30,40);

        // ISO 표준 시계열 문자열 -> 날짜 객체
        LocalDateTime parsedDate = LocalDateTime.parse("2026-11-01T11:30:12");
        // 커스텀
        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포멧터를 이용)
        String date = "2026-11-01 11:30:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date,dateTimeFormatter);

        System.out.println(now);
        System.out.println(parsedDate);
        System.out.println(parsedDate2);

        // 날짜 계산
        // now 는 불변객체(이뮨테이블객체) : 변하지 않는 객체
        // now는 현재시간 그대로
        LocalDateTime addOneDayFromNow = now.plusDays(1L); // Long타입이라서 L을 붙혀주는게 관습
        System.out.println(now);
        System.out.println(addOneDayFromNow);

        // 상대적인 날짜 계산
        // 이번달의 첫날 , 이번달의 마지막날 이런거
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());  // 이번달의 첫번째날 가져오기
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());  // 이번달의 마지막날 가져오기
        System.out.println(firstDayOfMonth);
        System.out.println(lastDayOfMonth);
        // 이번달의 첫번째 목요일
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025,9,10);
        // d1.isBefore(d2) : d1이 d2보다 과거냐? true or false
        System.out.println(d1.isBefore(d2)); // false
        // d1.isAfter(d2) : d1이 d2보다 미래냐? true or false
        System.out.println(d1.isAfter(d2)); // true
        // d1.equals(d2) : d1이 d2랑 날짜가 같냐? true or false
        System.out.println(d1.equals(d2)); // false

        // Period 객체 : 두 날짜의 연/월/일 단위로 분해해서 각각의 차를 구하는 객체
        // Period.between  : 두 날짜의 차이
        Period p1 = Period.between(d1,d2);
        System.out.println(Math.abs(p1.getYears())); //1
        System.out.println(Math.abs(p1.getMonths())); //2
        System.out.println(Math.abs(p1.getDays())); //10

        // ChronoUnit 객체

        Long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays)); //436일

        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);

    }
}
