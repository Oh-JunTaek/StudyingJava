package chapter_02;

public class _04_operater4 {
    public static void main(String[] args) {
        //논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        // Or(||) 연산과  And(&&) 연산
        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true이면 true가 나온다. "||이거가 or의 기능"<-엔터키 위에 있음
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두가 true여야지 true가 된다. 7
        System.out.println((5 > 3) && (3 > 1)) ; // 5는 3보다 크고 3은 1보다 크다.
        //System.out.println(1 < 3 < 5); 이렇게 2개 이상의 연산자를 동시에 넣을 수 없다. 할거면 (1 < 3) && (3< 5) 이렇게 나눠서

        // 논리 부정 연산자 <!를 붙이면 반대가 된다>
        System.out.println(!true); // false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(3 == 5)); //true




    }
}
