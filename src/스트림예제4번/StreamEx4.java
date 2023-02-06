package 스트림예제4번;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 스트림은 자바8 버전에 추가된 문법
// 객체 요소를 처리하는 스트림 (IntStream, LongStream, DoubleStream)은 각각의 기본 타입인
// int, long, double 요소를 처리함
// 자바에서 제공하는 모든 컬렉션의 최고 상위 조상인 Collection 인터페이스에는 stream() 메소드가 정의 되어 있음
public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.stream().forEach(System.out::println); // 메소드 참조 문법을 사용할 수 있음
//        list.stream().forEach(s->System.out.println(s + " ")); // 공백 넣기
        IntStream stream = IntStream.rangeClosed(1, 100); // 1 ~ 100 합 구하기
        int sum = stream.sum();
        System.out.println(sum);
    }
}
