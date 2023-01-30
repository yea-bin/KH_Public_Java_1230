package 코코아톡;

// 인터페이스의 메소드는 자동으로 public abstract 로 만들어집니다.
public interface NetAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("WiFi >>" + msg);
    }
}
class FiveG implements NetAdapter {

    @Override
    public void connect() {}

    @Override
    public void send(String msg) {
        System.out.println("5G >>" + msg);
    }
}