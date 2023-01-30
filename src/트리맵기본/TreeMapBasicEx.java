package 트리맵기본;

import java.util.Map;
import java.util.TreeMap;

// TreeMap : TreeSet 과 마찬가지로 이진검색트리로 구현됨
// TreeSet 과 차이는 키와 값으로 구성된 Map.Entry 를 저장
// 부모키값 기준으로 작은건 왼쪽 큰건 오른쪽으로 자동 저장
public class TreeMapBasicEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "나희도");
        score.put(88, "고유림");
        score.put(75, "백이진");
        score.put(65, "구자경");
        score.put(98, "우영우");
        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry(); // Map.Entry 에서 제일 낮은 값을 리턴
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry(); // Map.Entry 에서 제일 높은 값을 리턴
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());

        entry = score.lowerEntry(95); // 주어진 키 값의 바로 아래 값
        System.out.println("바로 아래 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(95); // 주어진 키 값의 바로 위 값
        System.out.println("바로 위 점수 : " + entry.getKey() + " : " + entry.getValue());
    }
}
