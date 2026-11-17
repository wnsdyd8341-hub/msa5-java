package org.example.e03if;

public class E03If {
    public static void main(String[] args) {
        int score = -1;
        String str = "";
        if(score>100 || score <0) {
            System.out.println("유효한 점수가 아닙니다.");
        }else {
            if (score == 100) {
                str = "A+";
            } else if (score >= 90) {
                str = "A";
            } else if (score >= 80) {
                str = "B";
            } else if (score >= 70) {
                str = "C";
            } else if (score >= 60) {
                str = "D";
            } else {
                str = "F";
            }
            System.out.printf("당신의 점수는 %d점 입니다 . <%s> \n", score, str);
        }

        int num = 1;
        String medal = "";
        switch (num){
            case 1:
                medal = "금상";
                break;
            case 2:
                medal = "은상";
                break;
            case 3:
                medal = "동상";
                break;
            case 4:
                medal = "장려상";
                break;
            default:
                medal = "노력상";
                break;
        }
        System.out.printf("당신의 메달은 %s 입니다. ", medal);

    }

}
