package 소켓명함다중전송서버;

import 명함전송서버.NameCardInfo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름, 전화번호, 회사명, 이메일 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송
// 연결된 클라이언트 개수에 상관없이 모든 클라이언트에게 전송
public class MultiSerialEx2 {
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
                Thread nameTh = new NameServerTh(socket);
                nameTh.start();
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

class NameServerTh extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;
    public NameServerTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < sockets.size(); i++) {
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(MultiSerialEx2.writeNameCard()); // 직렬화를 위해 객체를 write
                oos.flush();
                oos.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
                os.close();
            }
        } catch (IOException e) {}
    }
}

