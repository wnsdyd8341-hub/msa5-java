package org.example.e02operator;

public class E02Operator {
    public static void main(String[] args) {
        int n1 = 2 , n2 = 5;
        // 산술연산자
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1/n2);
        System.out.println(n1*n2);
        System.out.println(n1%n2);

        // 산술 대입 연산자
        int n3 = 0;
        n3+=3;
        n3-=3;
        n3/=3;
        n3*=3;
        n3%=3;

        // 증감 연산자
        n1++;
        ++n1;
        n1--;
        --n1;

        // 비교 연산자
        System.out.println(n1>n2);
        System.out.println(n1>=n2);
        System.out.println(n1<=n2);
        System.out.println(n1<n2);
        System.out.println(n1==n2);
        System.out.println(n1!=n2);

        // 문자열 비교
        String str1 = "str1";
        String str2 = "str1";
        System.out.println(str1.equals(str2));
        String str3 = new String("str1"); // 주소를 새로 만들어서 쓰는거라 주소가 다름
        System.out.println(str1.equals(str3));  // equals 값을 비교
        System.out.println(str1==str3); // 비교연산자는 주소를 비교

        // 논리 연산자

        int num10 = 0,num11 = 2;
        System.out.println(num10 > 0 && num11 <=11);
        System.out.println(num10 > 0 || num11 <=11);
        System.out.println(!(num10 > 0));

        // 삼항 연산자
        String result = n1 > n2 ? "num1이 크다" : "num2가 크다";



    }


}
