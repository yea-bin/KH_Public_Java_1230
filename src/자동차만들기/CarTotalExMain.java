package 자동차만들기;

import java.util.Scanner;

public class CarTotalExMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] distArr = {0, 400, 150, 200, 300};
        System.out.println("이동 지역을 선택하세요 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int dist = sc.nextInt();
        int realDist = distArr[dist];

        int city = sc.nextInt();
        System.out.println("이동할 승객 수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println("이동 차량을 선택하세요 [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel = sc.nextInt();
        System.out.println("부가 기능을 선택하시겠습니까? ON/OFF : ");
        int option = sc.nextInt();


    }
}
