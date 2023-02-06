package 람다예제2번;
// 매개변수가 있는 람다식 : MyFuncInterface fi = x -> {....}

@FunctionalInterface // 함수형 인터페이스의 문법 체크 (메소드 1개만 와야 함)
interface MyFuncInterface {
    public void method(int x); // 원래 함수만 있으면 되지만 자바 문법의 특성 때문에 인터페이스가 필요
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);
    }
}
