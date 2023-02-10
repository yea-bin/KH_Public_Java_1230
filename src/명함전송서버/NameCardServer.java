package 명함전송서버;
// 1. 명함 정보 담을 클래스 생성 (이름, 전화번호, 이메일, 소속)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. NameCard Thread 만들고 연결 요청이 오는 클라이언트에 명함 전송
// 명함 전송 여부 묻기 : 전송하시겠습니까? (Yes/No)
// 4. 클라이언트에서 명함을 수신하면 출력

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameCardServer {
    static List<NameCardInfo> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int port = 4233;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while (true) {
            Socket socket = serverSocket.accept(); // 클라이언트 연결 요청에 대한 대기
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + " 연결]");
            System.out.print("클라이언트로 명함을 전송하시겠습니까?(Yes/No) : ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("Yes")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard()); // 객체 직렬화
                oos.flush();
                oos.close();
                os.close();
            }
        }
    }
    static List<NameCardInfo> writeNameCard() {
        list.add(new NameCardInfo("로제", "010-1234-5678", "num@gmail.com", "블랙핑크"));
        list.add(new NameCardInfo("제니", "010-1234-5678", "num@gmail.com", "블랙핑크"));
        list.add(new NameCardInfo("하니", "010-1234-5678", "num@gmail.com", "뉴진스"));
        list.add(new NameCardInfo("민지", "010-1234-5678", "num@gmail.com", "뉴진스"));
        list.add(new NameCardInfo("은채", "010-1234-5678", "num@gmail.com", "르세라핌"));
        list.add(new NameCardInfo("카즈하", "010-1234-5678", "num@gmail.com", "르세라핌"));
        list.add(new NameCardInfo("윈터", "010-1234-5678", "num@gmail.com", "에스파"));
        list.add(new NameCardInfo("카리나", "010-1234-5678", "num@gmail.com", "에스파"));
        list.add(new NameCardInfo("원영", "010-1234-5678", "num@gmail.com", "아이브"));
        list.add(new NameCardInfo("레이", "010-1234-5678", "num@gmail.com", "아이브"));
        return list;
    }
}
