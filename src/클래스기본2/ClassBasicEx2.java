package 클래스기본2;

public class ClassBasicEx2 {
    public static void main(String[] args) {
        Car g80 = new Car("제네시스 G80", "White", 230);
        Car santafe = new Car();

        g80.viewCar();
        santafe.setName("싼타페다다다");
        santafe.viewCar();
    }
}