package 예외처리예제4번;

import java.io.FileWriter;
import java.io.IOException;

// finally : 프로그램 실행 도중 예외 상황이 발생하면 catch 구문 수행
// 하지만 예외 발생 여부와 상관없이 항상 수행되어야 하는 구문이 있는 경우 finally 로 처리
public class ExceptionEx4 {
    public static void main(String[] args) {
//        int rst = 0;
//        try {
//            rst = 4 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다.");
//        } finally {
//            shouldBeRun();
//        }
//    }
//    static void shouldBeRun() {
//        System.out.println("항상 수행되는 구문입니다.");

        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace(); // 예외처리 발생 당시 Call Stack 에 있던 결과값을 화면에 출력
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
