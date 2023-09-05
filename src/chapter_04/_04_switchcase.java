package chapter_04;

public class _04_switchcase {
    public static void main(String[] args) {
        // switch case
        // 1등 전액 장학금
        // 2등 반액 장학금
        // 3등 반엑 장학금
        // 그 외 장학금 대상 아님

        int rank = 1;
        if (rank ==  1) {
            System.out.println("전액 장학금");
        } else if (rank == 2) {
            System.out.println("반액 장학금");
        } else if (rank == 3) {
            System.out.println("반액 장학금");
            //else if (rank == 2 || rank ==3) 이렇게 해도 된다. 2등과 3등의 출력값이 같기에
        }else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");

        //switch case를 활용해서 바꿔보자
        switch (rank){
            case 1 :
                System.out.println("전액 장학금");
                    break; // 이게 있어야 조건 만족시 switch문을 나와서 다음 문장을 수행한다.
            case 2:
                System.out.println("반액 장학금");
                    break;
            case 3 :
                System.out.println("반액 장학금"); //케이스 2와 같아서 밑줄이 생김.
                    break;
            //case 2 :
            //case 3 :
            // sout("반액장학금") 출력값이 2와 3이 같다면 이렇게해도 된다.
            default: //위 케이스에 해당하지 않을 경우 default를 실행한다.
                System.out.println("장학금 대상 아님");
        }

        //중고 상품의 등급에 따른 가격을 책정해보겠다.

        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1 :
                price += 1000; // price = price + 1000
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        //break가 없기 때문에 1등급이면 case1,2,3까지 쭉 내려오면서 천원을 한번 씩 더해서 만원이 된다.
    }
}
//IF else는 범위, switch case는 명확한 케이스가 있는 경우.