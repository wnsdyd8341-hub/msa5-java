package org.example.e01datatype;

public class E01DataType {

    public void execute(){
        boolean bool = true;
        System.out.print(bool);
        System.out.println(bool);

        // 변수 선언
        char ch = 'a';
        String str = "a";

        // 상수
        // 상수는 변수명을 대문자
        final String USER_NAME= "길동";

        // Underscore 표기법
        int num = 1_000_000_000;

        int swap1 =1, swap2 = 2;
        int tmp;
        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입
        boolean boo2 = true;
        byte bt = 127;
        short sh = 32767;
        int i = 2_147_483_647;
        // logn 타입은 L 을 붙혀줌
        long l = 2_147_483_647L;

        double db = 3.141592;
        // float 타입은 F 붙혀줌
        float ft = 3.141592F;

        char ch1 = 'g';

    }


}
