package 게임만들기쓰레드;

// 추상클래스 생성했기때문에 객체 생성 X
abstract public class Unit {
    protected String name; // 캐릭터 이름
    protected int pPower; // 피지컬 Power (물리적인 힘)
    protected int mPower; // 매지컬 Power (마법 힘)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 (해당 캐릭터의 특수 기술)
    protected int hp; // 체력
}
