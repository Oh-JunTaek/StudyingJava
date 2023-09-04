package chapter_03;

public class _02_string2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환  f12) and 를 , 로 바꿔보겠다.
        System.out.println(s.replace(" and", ",")); // and 를 , 로 바꿨다.
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        // 자바 인덱스 를 찾는다//(s.indexOf("Java"),s.indexOf"."))라고 하면 마지막 글자(.) 직전 까지 자름.

        //공백 제거하기
        s = "                I love Java.              ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // 여백없이 결합된다.
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); //concat은 결합
    }
}
