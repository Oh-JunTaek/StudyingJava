package chapter_04;

public class _07_dowhile {
    public static void main(String[] args) {
        // 반복문 DoWhile

        int distance = 25; // 전체 거리25
        int move = 0 ; // 현재 이동 거리0
        int height = 2; // 키 2
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; //3m이동
        }
        System.out.println("도착했습니다.");


    }
}
