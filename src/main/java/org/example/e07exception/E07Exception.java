package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");

            // 에러가 발생하면 캐치문으로 바로 빠진다
            double result = 10/0;
            // throw new 예외이름("메세지 보여줄거");
            throw new RuntimeException("에러 발생");

            // System.out.println("트라이 끝");
        // 예외 종류별로 작성하고 싶을때 catch문을 늘리면서 작성가능
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생");
        }
        catch (Exception e) {
            // Exception <- 이것도 다형성으로 부모이름을 쓴거
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");
        }finally {
            System.out.println("파이널리");
        }

        // Try with Resource

        // 파일 오픈
        FileWriter file = null;
        try {
            // 파일을 쓰기 모드로 불러오기
            file = new FileWriter("text.txt");
            file.write("안녕 자바!");
        }catch (IOException e){
            //IOException  : Input Output 예외
            e.printStackTrace();

        }finally {
            // 파일 닫아주기
            // 파일 닫을때 예외가 있을수도 있어서 다시 감싸줘야한다
            try {
                if(file!=null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // file을 닫는 처리까지 내부적으로 해준다
        // Try with Resource 문으로 쓰는거
        try(FileWriter file1 = new FileWriter("text.txt")){
            file1.write("안녕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
