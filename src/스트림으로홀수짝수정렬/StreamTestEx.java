package 스트림으로홀수짝수정렬;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

// 7개의 정수 입력 받아 홀수/짝수 나누어 출력
// 스트림 이용하기
public class StreamTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for (int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream().filter(n->n % 2 != 0).forEach(s->System.out.print(s + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(s->System.out.print(s + " "));
    }
}
