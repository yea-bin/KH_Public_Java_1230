package 진수변환;

import java.util.Scanner;

// 문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램 작성
// 입력 : 첫째줄에 8진수가 주어짐
// 출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로 시작
// 314 => 각 자리의 수가 0 ~ 7
// 11001100
// 000 001 010 011 100 101 110 111
//       1  10  11 100 101 110 111
public class ConversionEx {
    public static void main(String[] args) {
        String [] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String [] two = {"", "1", "10", "11", "100", "101", "110" ,"111"};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == 1 && str.charAt(0) - '0' == 0) {
                System.out.println("0");
                break;
            }
            if(i == 0) {
                System.out.print(two[str.charAt(0) - '0']);
            } else {
                System.out.print(eight[str.charAt(i) - '0']);
            }
        }
    }
}
