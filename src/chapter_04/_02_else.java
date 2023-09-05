package chapter_04;

public class _02_else {
    public static void main(String[] args) {
        //조건문 if , else

        int hour = 10;
        if (hour < 14 ){
            System.out.println("아아 +1");
        } else { // 이프에 포함되지 않는 경우이면 이 문장을 수행한다.
            System.out.println("아아(디카페인)+1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후거나 모닝 커피를 마신 경우?

        hour = 13;
        boolean mc = false;
        if (hour >= 14 || mc ==true){
            System.out.println("아아(디카페인)+1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
