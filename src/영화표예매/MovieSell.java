package 영화표예매;

import java.util.Scanner;

public class MovieSell {
    int seat[] = new int[10]; // 판매 좌석 표시를 위한 배열 생성
    // 좌석 판매 상태를 보여줌
    void printSeat() {
        for(int i = 0; i < seat.length; i++) {
            if(seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }

    // 판매를 위해 좌석을 선택하도록 하는 메뉴
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력 하세요 : ");
        int seaNum = sc.nextInt();
        if(seat[seaNum - 1] == 0) { // 판매 가능 여부를 확인
            seat[seaNum - 1] =1; // 판매 되었음 표시
            printSeat();
        } else {
            System.out.println("이미 판매된 좌석 입니다. 다른 좌석을 선택 하세요.");
        }
    }
    int totalAmount() {
        int cnt = 0;
        for (int val : seat) {
            if(val == 1) cnt++;
        }
        return cnt * 12000;
    }
}
