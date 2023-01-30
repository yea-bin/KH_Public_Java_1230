package Arrays과일정렬;
// Arrays sort() : Comparator 사용하기
// 정렬은 기본적으로 오름차순
// 임의의 10개 과일 이름의 배열 생성, 길이순으로 정렬 후 만약 길이 같으면 사전순으로 정렬
// 문자열 길이를 비교하기 : length()
// compareTo() : 문자열을 ASCII 코드 값으로 비교해 결과 를 양수/0/음수로 반환
// 반환값이 양수이면 정렬 조건이 되고 음수이면 현 상태 유지의 조건

import java.util.Arrays;
import java.util.Comparator;

public class FruitEx {
    public static void main(String[] args) {
//        Integer [] arr = {5,3,5,6,7,123,567,667};
//        Arrays.sort(arr);
//        for(int e : arr) System.out.print(e + " ");   내림차순 정렬
//        Arrays.sort(arr, Collections.reverseOrder());
//        for(int e : arr) System.out.print(e + " ");


        // 문자열 배열을 만들어 과일이름을 10개 생성
        String [] fruit = {"Apple", "Orange", "Banana", "Peach", "Cherry", "Plum",
        "Strawberry", "Watermelon", "Grape", "Blueberry"};

        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째보다 길기 때문에 정렬 조건에 해당
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 첫번째보다 두번째가 사전 순서상 앞이면 양수, 같으면 0, 뒤면 음수

                    }
                    return -1; // 정렬하지 않는 조건
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수
        System.out.println(test.compareTo("ac")); // 음수
    }
}
