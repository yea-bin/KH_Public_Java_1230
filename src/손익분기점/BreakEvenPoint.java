package 손익분기점;
// 손익분기점 : 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 의미
// A(고정비용), B(가변비용), C(판매가격)
// 이익이 나는 지점의 생산 댓수 출력하기
// 손익분기점이 존재하지 않으면 -1 출력
import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixCost = sc.nextInt();
        int valCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if(valCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost / (sellPrice - valCost) + 1));

//        while (true) {
//            if (fixCost + (valCost * cnt) < sellPrice * cnt) break;
//            cnt++;
//        }

//        while (true) {
//            if(cnt > fixCost / (sellPrice - valCost)) break;
//            cnt++;
//        }

//        System.out.println(cnt);
    }
}
