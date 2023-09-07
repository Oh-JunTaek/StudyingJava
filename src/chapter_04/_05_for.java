package chapter_04;

public class _05_for {
    //반복문 for
    public static void main(String[] args) {
        //매장 은마

        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        //인사 시스템 변경
        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        System.out.println("어서오세요. 은마 입니다.");
        //뭐 이런식으로 반복이 된다. ALT 드래그를 하면 세로로 드래그가 된다.

        //for ( 선언; 조건 ; 증감 ) {
        for (int i = 0; i < 10; i++) {
            // int i 값이 ; 10보다 작으면 아랫줄 수행하고 다시 ; 증감부분을 돌아오고 조건을 불충시 선언문을 끝낸다.
            System.out.println("어서오세요. 은마 입니다." + i);
        }

        // 짝수만 출력해보자(fori 엔터하면 문장완성 시켜준다.)


        for (int i = 0; i < 10 ; i+= 2) {//++하면 1씩 늘었지만 +=2를 해서 2씩 더하면 짝수가 되었다.
            System.out.println(i); //sout에서 프린트ln에서 ln을 지우면 줄바꿈을 하지 않는다.
        }

        System.out.println();//sout만하고 넘겨서 엔터키를 사용한 기능을 나타내었다.
        //이번엔 홀수만 뽑아보자

        for (int i = 1; i < 10 ; i+= 2) { //시작값을 1로 넣고 2를 더하면 된다.
            System.out.println(i);

        }

        //이번엔 내림차수

        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }

        // 1부터 10까지의 수들의 합

        int sum = 0 ;//sum이라는 변수 지정 처음에는 0으로 했다.
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("1부터 10까지의 모둔 수의 총 합은 " + sum + "입니다");
        }
        //중괄호 밖에다가 System.out.println("1부터 10까지의 모둔 수의 총 합은 " + sum + "입니다"); 를하면
        //과정이 쭉 안나오고 결과값만 나온다.
        System.out.println("1부터 10까지의 모둔 수의 총 합은 " + sum + "입니다");
    }
}
