package org.example.e06oop;

public class AccessModifier {
    // 접근 제어 지시자
    // default : 같은 패키지에 소속된 클래스에서만 접근 가능 ex) class명
    String strDefalut = "Default";
    // public : 어디서든 접근 가능 ex) public class명
    public String strPublic = "Public";
    // private : 클래스 내부에서만 ex) private class명
    private String strPrivate = "Private";
    // protected : 같은 패키지 or class 내부 or 자식클래스에서 접근 가능 ex) protected class명
    protected String strProtected = "Protected";

    public void fnPublic(){
        System.out.println("Public Fn");
    }
    private void fnPrivate(){
        System.out.println("Private Fn");
    }
    protected void fnProtected(){
        System.out.println("Protected Fn");
    }

}

