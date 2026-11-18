package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr1 = {1,2,3};

        System.out.println(Arrays.toString(arr));

        int[] originArr = {1,5,9};
        int[] copyArr = originArr;
        copyArr[0] = 999;

        // System.arraycopy() : 깊은 복사
        int[] originArrSystem = {1,2,3};
        int[] copyArrSystem = new int[originArrSystem.length * 2];
        // (복사할 배열 , 몇번 인덱스부터 할건지 , 복사 받을 배열 , 인덱스 번호 , 배열 길이)
        System.arraycopy(originArrSystem,0,copyArrSystem,0,originArrSystem.length);
        copyArrSystem[0] = 999;

        // Arrays.copyof() 깊은 복사
       int[] originArrArrays = {1,2,3};
       int[] copyArrArrays = new int[originArrArrays.length*2];
       // Arrays.copyOf(복사할 배열 , 배열 길이) : 배열 길이자체도 복사해서 배열의 길이가 줄어듬
        // , 그래서 원본과 똑같은 길이만 필요할때
       copyArrArrays = Arrays.copyOf(originArrArrays,originArrArrays.length);
       copyArrArrays[0] = 999;

       // 다차원배열
       int [][] multiArr = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
       int num = multiArr[1][1];

       // 배열의 API
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3};
        // 배열 길이
        System.out.println(arr3.length);

        // 배열 같은지 비교 값 비교
        System.out.println(Arrays.equals(arr3,arr4));

        // 다차원 배열 값 비교
        int[][] darr1 = {{1,2,3},{4,5,6}};
        int[][] darr2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepEquals(darr1,darr2));

        // 배열 정렬
        int[] sortArr= {1,7,11,3,31,54};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));

    }
}
