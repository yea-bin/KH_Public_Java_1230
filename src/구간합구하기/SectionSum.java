package 구간합구하기;

import java.util.Scanner;

public class SectionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0, right = 0;
        long sum = 0;
        while (m != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            for (int i = left - 1; i < right; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            sum = 0;
            m--;
        }

    }
}
