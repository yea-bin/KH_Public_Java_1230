package 객체비교복습;
// 10명의 성적 입력 (미리 만들어 둠)
// 이름 국어 영어 수학
// 총점이 높은 순으로 정렬, 총점 같으면 이름순
// comparator, comparable, collection 의 sort 이용하는 방법 등이 있음

import java.util.Iterator;
import java.util.TreeSet;

public class ObjectCompFinal {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("최치열", 80, 80, 100));
        info.add(new StudentInfo("우영우", 100, 98, 95));
        info.add(new StudentInfo("이준호", 77, 67, 88));
        info.add(new StudentInfo("남행선", 55, 45, 35));
        info.add(new StudentInfo("남해이", 99, 97, 94));

//        for (StudentInfo e : info) { // 향상된 for 문
//            System.out.println(e.getTotal() + " : " + e.getName());
//        }

        Iterator<StudentInfo> iterator = info.iterator();
        while (iterator.hasNext()) {
            StudentInfo next = iterator.next();
            System.out.println(next.getTotal() + " : " + next.getName());
        }
    }
}

class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public int getTotal() {
        return kor + eng + mat;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name); // 오름차순
        return o.getTotal() - this.getTotal();
    }
}