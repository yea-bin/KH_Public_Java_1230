package 제네릭복습;

public class GenericTestFinal {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);
    }
}

class Powder {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}
class Plastic {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}

// T는 타입변수를 의미, 대입되는 타입으로 내부의 형이 결정됨 (단, 참조 타입만 올 수 있음)
class GenericPrinter<T> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
}