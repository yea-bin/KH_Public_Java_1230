package 숫자의합;

import java.util.Scanner;

// 문제 : n개의 숫자가 공백없이 쓰여있음 이 숫자를 모두 합해서 출력하기
// 입력 : 54321
// 출력 : 15
// 종료조건 : 0000

public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        while (true) {
            int sum = 0;
            System.out.print("입력 : ");
            number = sc.next();
            if (number.equals("0000")) break;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }
            System.out.println("출력 : " + sum);
        }
    }
}
