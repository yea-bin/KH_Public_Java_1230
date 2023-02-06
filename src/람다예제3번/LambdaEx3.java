package 람다예제3번;
// 리턴값이 있는 람다식 : MyFuncInterface fi = (x, y) -> x < y ? x : y; (구현부 한줄 코드 중괄호 X)

@FunctionalInterface
interface MyFuncInterface {
    public int min(int x, int y); // 메소드가 1개만 존재해야 함
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 중괄호가 없어야 함
        System.out.println(fi.min(3, 4));
    }
}
