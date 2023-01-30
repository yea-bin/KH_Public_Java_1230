package 전자레인지;

import java.util.Scanner;

// 3개의 시간조절용 버튼 A, B, C가 달려 있습니다.
// A 버튼은 5분, B 버튼은 1분, C 버튼은 10초 단위로 시간을 설정 할 수 있습니다.
// 예를 들어 요리시간 100초가 소요 된다면 (B버튼 1회, C버튼 4회) => T=014
// 3개의 버튼으로 시간을 맞출 수 없는 경우 -1
public class MicrowaveEx {
    public static void main(String[] args) {
        int t, a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("요리시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300; // 5분 나눈 몫
            b = t % 300 / 60;
            c = t % 300 % 60 / 10;
            System.out.printf("T=%d%d%d\n", a,b,c);
        }


    }
}
