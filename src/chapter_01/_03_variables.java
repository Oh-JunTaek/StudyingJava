package chapter_01;

public class _03_variables {
    public static void main(String[] args) {
        //psvm이라고 치면 된다. args 문자열을 배열로 사용하겠다 라는 의미.
        String name;
        //string = 여러 문자열을 표기하기 위한 장치.
        name = "헹구";
        int hour = 16;
        //인트는 정수값을 넣는다. 'hour' 라고 이름을 지었고 그 안에 16이라는 값을 넣었다.


        System.out.println(name + "님 배송이 시작되었습니다." + hour + "시에 줄게용ㅋ");
        System.out.println(name + "님 도착했규 확인하규");
        //sout치면 된다. 앞에서 name 지정된 변수값을 넣고 ""안에 말을 넣는다. + 양옆에 스페이스바 잊지 말고.

        double score = 90.5;
        //double = 실수를 표기하기 위한 장치. float 보다 규모가 크고 정밀하다 ->처리속도가 더 걸린다.
        char grade = 'A';
        //char = 하나의 문자열을 표기하기 위한 장치.
        //string = 여러 문자열을 표기하기 위한 장치.
        name = "히잉구우";
        System.out.println(name + "님의 평균 점수는" + score + "점 입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        //참과 거짓을 나타내는 장치.
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123123;
        float f = 3.14123123F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
