package 중복없는로또번호생성;

import java.util.ArrayList;
import java.util.List;

public class LottoArray {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        int tmp;

        while (true) {
            tmp = (int)((Math.random() * 45) + 1);
            if (!lotto.contains(tmp)); lotto.add(tmp);
            if(lotto.size() == 6) break;
        }
        System.out.println(lotto);
    }
}