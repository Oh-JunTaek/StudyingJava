package chapter_03;

public class _01_string1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 -> s.length() [ex)리뷰 글자수 체크할때 등에 사용]
        System.out.println(s.length()); //29

        // 대 소문자 변환 -> s.to~~~~()
        System.out.println(s.toUpperCase()); //모두 대문자로
        System.out.println(s.toLowerCase()); //모두 소문자로

        // 포함 관계 -> s.contains("~~"
        System.out.println(s.contains("Java")); //포함되면 true 가 출력된다.
        System.out.println(s.indexOf("Java")); //처음 일치하는 위치 정보 [0부터 시작해서 spacebar 까지 카운팅] //없는 값을 넣으면 -1이 출력
       // System.out.println(s.lastIndexOf("and"); //마지막으로 일치하는 위치 정보.
        System.out.println(s.startsWith("I like")); //~~값으로 시작하는 문자열이면 true
        System.out.println(s.endsWith(".")); // ~~값으로 끝나는 문자열이면 true


    }
}
