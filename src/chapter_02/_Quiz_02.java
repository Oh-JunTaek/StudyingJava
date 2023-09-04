package chapter_02;

import javax.swing.*;

public class _Quiz_02 {
    public static void main(String[] args) {// **(결과) = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)**

        int x = 115;
        int y = 121;
        String able = "탑승";
        String anable = "불가능";
        boolean cm = ((x >= 120) ? (able) : (anable)).isEmpty();



        System.out.println("키가" + x + "cm이므로 탑승" + cm + "합니다.");





        int height = 115;
        boolean 가능 = true;
        boolean 불가능 = false;
        String a = (height >= 120) ? "가능합니다." : "불가능합니다.";
        System.out.println("키가" + height + "cm이므로 탑승" + a);


    }
}
