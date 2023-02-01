package 쓰레드예제9번;
// 데몬쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드
// 다른 쓰레드가 모두 종료되면 자동으로 종료
// start()메소드 호출하기 전에 setDeamon(true)를 호출
public class ThreadEx9 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        Thread.sleep(20000);

    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장합니다...");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            save();
        }
    }
}