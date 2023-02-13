package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
    public static void main(String[] args) {
        int port = 4233;
        try {
            // 서버를 만들 때는 두가지 정보 (IP / port 번호) 필요
            ServerSocket serverSocket = new ServerSocket(port); // port 번호만 넣으면 자동으로 서버 IP는 지정 (첫번째 IP가 자동 등록)
            while (true) { // 서버는 반복문을 수행하면서 클라이언트의 요청을 받음
                // 하나의 session, 하나의 연결 통로 생성
                Socket socket = serverSocket.accept();
                Thread serverTh = new MultiChatThread(socket);
                serverTh.start();
            }
        } catch (IOException e) {}
    }
}
