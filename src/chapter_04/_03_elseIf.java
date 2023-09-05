package chapter_04;

public class _03_elseIf {
    public static void main(String[] args) {
        //  조건문 elseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아아 +1

        boolean halla = true;
        boolean mango = true;

        if (halla) {
            System.out.println("한라봉 에이드 +1");
        } else if (mango) { //halla가 없다면 mango를 검색해라, //여러번 사용 가능하다.
            System.out.println("망고주스 +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료:");
    }
}
