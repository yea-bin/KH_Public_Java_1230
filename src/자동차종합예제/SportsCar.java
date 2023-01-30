package 자동차종합예제;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 250;
        fuelEff = 8; // 연비
        fuelTank = 30;
        seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}
