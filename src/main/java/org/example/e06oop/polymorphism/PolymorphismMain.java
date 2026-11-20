package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale = new Whale();
        Mammar whale2 = new Whale();
        // 오버라이딩 된 메소드에는 접근이 가능한데 , 그렇지 않은 메소드는 접근 불가능
        whale2.birth();

        Mammar[] arr = new Mammar[3];
        arr[0] = new Whale();  // 업캐스팅 된 객체
        arr[1] = new Mammar();

        arr[0].birth(); // 오버라이딩 된 자식 메소드 출력
        for(Mammar i : arr){
            i.birth();
        }

        // 업캐스팅 : 자식클래스가 부모클래스 타입으로 캐스팅 되는 것
        //   부모클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근 불가능
        Mammar upCasting1 = new Whale();
        // upCasting1.swimming();  // 자식클래스의 swimming() 접근 안됨

        // 다운캐스팅 : "업캐스팅한 인스턴스"를 다시 본인의 데이터 타입으로 캐스팅하는 것
        // 다운캐스팅을 하는 이유는 배열을 루프문같은걸 돌릴때 자식의 메소드를 사용하기 위해서
        Whale downCasting1 = (Whale)upCasting1;
        downCasting1.swimming();

    }
}
