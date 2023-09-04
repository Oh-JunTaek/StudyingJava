package chapter_03;

public class _03_stringcompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자 내용이 같으면 true
        System.out.println(s2.equals("python")); // 대소문자를 구분하기에 얘는 false
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 하지 않는다.

        //문자열 비교 심화
        s1 = "1234"; //ex) 벽에 붙은 메모지의 비밀번호(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true(내용)
        System.out.println(s1 == s2); //true(참조)

        s1 = new String("1234");
        s2 = new String("1234");//뉴스트링은 선언하는 값을 저장하는 메모리가 다르다고 본다.

        System.out.println(s1.equals(s2)); //true ->내용을 비교 하면 같다
        System.out.println(s1 == s2); //false ->어디를 참조했는지가 다르다.
    }
}
//강의 결론 : 비교할때는 이퀄스를 써라.
