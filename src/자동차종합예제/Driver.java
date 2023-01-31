package 자동차종합예제;

public class Driver { //상속x
    void driver(Car car, int passCnt, int dist, boolean mode) {
        car.setMode(mode);
        int moveCnt = car.getMovingCnt(passCnt); // 승객의 수를 입력 받아 이동 횟수를 구함
        System.out.println("총 비용 : " + car.getTotalCost(dist, moveCnt));
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist, moveCnt));
        System.out.printf("총 이동 시간 : %.3f\n", car.getMovingTime(dist, moveCnt));
    }
}