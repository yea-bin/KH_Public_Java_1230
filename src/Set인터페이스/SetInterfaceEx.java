package Set인터페이스;

// 중복 허용 안 함, 순서 유지 안 함
// HashSet : HashCode() 메소드 리턴값을 사용하여 객체의 동일 여부 판단

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "유나"));
        hashSet.add(new Member(1002, "카리나"));
        hashSet.add(new Member(1003, "진"));
        hashSet.add(new Member(1003, "안유진"));

        for (Member e : hashSet) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("----------------");
        }
    }
}
