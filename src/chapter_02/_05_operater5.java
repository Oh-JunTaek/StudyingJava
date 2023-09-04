package chapter_02;

public class _05_operater5 {
    public static void main(String[] args) {
        // 삼항 연산자 -> 조건연산자인데 어떤 조건을 만족하면 어떤값을 넣는데 만족 못하면 다른 값을 넣게 한다.
        // **(결과) = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)**

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);


        boolean b = (x == y) ? true : false;
        System.out.println(b); //false

        String s = (x != y) ? "달라요": "같아요" ;
        System.out.println(s); // 달라요
    }
}
