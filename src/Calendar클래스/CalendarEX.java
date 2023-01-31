package Calendar클래스;

import java.util.Calendar;

// Calendar 클래스는 추상클래스이므로 객체를 생성할 수 없음
// 정적메소드인 getInstance() 메소드로 운영체제의 시간을 가져옴
// Calendar 클래스에 포함된 모든 필드는 정적변수(클래스변수)
public class CalendarEX {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date(); 와 같음 (시간불러오는법)
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 달의 정보는 배열의 인덱스로 넘어오기 때문에 1 더해야 함
//        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 달에서 몇번째 날짜인지
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날짜인지 (일요일(1)부터 시작)
//        System.out.println(now.get(Calendar.AM_PM)); // 오전은 0, 오후는 1
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
//
        // yyyy년MM월dd HH시mm분ss초 형태를 Calendar 이용해 출력하기
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;

        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n", year, mon, day, hour, min, sec);
    }
}
