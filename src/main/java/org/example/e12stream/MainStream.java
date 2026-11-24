package org.example.e12stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> copyList = new ArrayList<>();
        for(Integer i : list){
            copyList.add(i+3);
        }

        // stream map을 사용해서 처리하는거
        List<Integer> result1 = list.stream().map((i)->i+3).toList();
        result1.forEach((i)->{
            System.out.println(i);
        });

        // 짝수 갯수 구해주세요
        int n=0;
        for(Integer i : list){
            if(i%2==0){
                n++;
            }
        }

        Long result2 = list.stream().filter((i)->i%2==0).count();


    }
}
