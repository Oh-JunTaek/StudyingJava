package chapter_01;

public class _05_vallublenaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_),문자, 숫자 사용 가능. (공백은 사용 불가)
        // 3. 밑줄이나 문자로 시작 가능하지만 숫자는 안됨
        // 4. 한 단어 또는 2개 이상의 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 ( 첫 단어는 제외)
        // 6. 예약어 사용 불가(public, static, void, int, double ...)

        //입국신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성"; //이름
        String lastName = "김"; //성
        String dateOfBirth = "2001-12-31"; //생년월일
        String residentialAdress = "무슨 호텔"; //체류지
        String purposeOfVisit = "관광"; // 입국목적
        String _frightNo = "ASD123";
        String _fright_no_2 = "ASD123";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

    }
}
