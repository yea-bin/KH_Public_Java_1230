package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessXArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 주어진 수
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            if (list.get(i) < x) System.out.print(list.get(i) + " ");
        }
    }
}
