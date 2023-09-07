package chapter_04;

public class _06_while {
    public static void main(String[] args) {
        //반복문 while


        //수영장에 왔다.
        int distance = 25 ; // 전체 거리 25
        int move = 0 ; //현재 이동 거리
        //while (조건) {}

        while (move < distance) { // 현재 이동 거리가 전체 거리 보다 작다는 조건을 만족 시킬 동안 반복
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; //3미터 이동
        }
        System.out.println("도착");

        // 무한 루프에 빠지지 않도록 조심. 조건문을 잘 확인하자.
    }
}
