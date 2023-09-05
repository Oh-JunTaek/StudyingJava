package chapter_04;

public class _01_if { //프로그램의 흐름 제어. 조건문
    public static void main(String[] args) {
        //조건문 IF

        //10시를 기준점으로 커피를 마실지 말지 정해보자
        int hour = 10;

        //if (조건)
        //... 수행할 명령 ...

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }// 여러문장을 하고 싶으면 중괄호로 묶어줘야 한다. 하나만 할거면 안해도 된다. 하지만 쓰기를 권장
        System.out.println("커피 주문 완료.");

        // 오후 2시 이전, 모닝커피를 마시지 않은 경우

        hour = 10;
        boolean mc = false;
        if (hour < 14  &&  mc == false){// &&는 and
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이후 이거나 모닝커피를 마신 경우 디카페인을 먹는다  || 는 or

        hour = 15;
        mc = true;

        if (hour >= 14 || mc  == true){
            //if (hour >= 14 || mc) 어처피 mc값이 true기 때문에 mc만 해도 된다.
            System.out.println("아아(디카페인) +1");
        }
        System.out.println("커피 주문 완료");
    }
}

