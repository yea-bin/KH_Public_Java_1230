package 블랙잭규칙;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드 합
        int rst = 0; // 결과 값
        System.out.print("카드 숫자 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int [] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = i+1; j < cnt; j++) {
                for (int k = j+1; k < cnt; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
    }
}
