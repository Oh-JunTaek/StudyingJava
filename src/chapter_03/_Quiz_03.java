package chapter_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        //앞6은 생년월일 뒷7은 성별이며, 입력데이터는 - 를포함한 14자리의 문자열 형태

        System.out.println("940126-1"); //[f12]940126-1234567 이지만 1까지만 출력한다

        //시작

        String num = "940126-1234567";
        System.out.println(num.substring(0));
        System.out.println(num.substring(0,8)); //0위치부터 8 위치까지
        System.out.println(num.substring(0, num.indexOf("-")+2)); // = 위치 에서 2칸 뒤 앞까지 끊겠다.

    }
}
