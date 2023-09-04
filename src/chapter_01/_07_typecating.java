package chapter_01;

public class _07_typecating {
    public static void main(String[] args) {
        // 형변환
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        //int score = 93 + 98.8;


        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93+ 98
        System.out.println(score); // 191

        score_d = (double)93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0
        //int -> long -?float ->double (자동 변환)

        //int convertedScoreInt = score_d; <-이게 안되는 이유는 큰 범위에 있는 데이터를 작은 데이터에 넣으려고 해서 일부가 짤림(소수점 버려짐)
        int convertedScoreInt = (int) score_d; //191.8 ->191로 바꾸는 과정
        // double ->float -> int (수동 형 변환이 필요하다) [int를 넣은것]

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
