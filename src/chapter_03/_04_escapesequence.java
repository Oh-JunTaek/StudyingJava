package chapter_03;

public class _04_escapesequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence/charcter 등등)
        // \n \t \\ \" \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); // \n : 줄바꿈

        //ex)가격표
        //해물파전 9000원
        //김치전 8000원
        //부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        // \t : 텝 효과를 가짐. 여러개 입력해도 됨.

        System.out.println("C:\\Program Files\\Java");
        // \의 기능을 활용하는게 아니라 문자를 입력하고 싶으면 \\ 이렇게 두번 누르면 문자 \ 로 출력이 된다.

        System.out.println("단비가 \"냐옹\"이라고 했어요."); // "안에 "를 넣고 싶으면 \" 하면 된다. ->특수문자개념
        char c = 'A';
        c = '\''; //char를 할때는 '로 문장 시작마무리를 하기 때문에 '를 추가하고 싶으면 \' 하면 된다.

    }
}
