package chapter_02;

public class _01_operater1 {
    public static void main(String[] args) {
        //산술 연산자
        //일반 연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2); // 2.5가 나오겠지만 정수간 연산일땐 소수점 버린다.
        System.out.println(2/4); //0.5기 때문에 0이 나올것이다
        System.out.println(4%2); // 4를 2로 나눴을때 나머지 ->0
        System.out.println(5%2); // 1

        // 우선 순위 연산
        System.out.println(2+2*2); //6이 나온다.
        System.out.println((2+2)*2); //8
        System.out.println(2+(2*2));

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a-b;
        System.out.println(c);

        //  증감 연산 ++, --\
        int val;
        val = 10;
        System.out.println(val); //10
        //val = val + 1;
        System.out.println(++val); //11  val에 1을 더한 다음에 문장을 실행한다.
        System.out.println(val); //11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); //val 값으로 문장을 실행한다. 이후 1을 더한다. 여기는 10이지만 밑에가 11이된다.(후배짬때리기)// 10
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        // 은행 대기열표

        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 0
        System.out.println("대기 인원 : " + waiting++); // 대기인원 1
        System.out.println("대기 인원 : " + waiting++); // 대기인원 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기인원 : 3






    }
}
