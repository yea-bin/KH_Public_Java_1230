package 명함전송클라이언트;

import 명함전송서버.NameCardInfo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 4233);
        System.out.println("서버 접속 성공");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCardInfo> nameCardInfos = (List<NameCardInfo>) ois.readObject();
        viewNameCards(nameCardInfos);
    }
    static void viewNameCards(List<NameCardInfo> nameCardInfos) {
        for (NameCardInfo e : nameCardInfos) {
            System.out.println("==== 명함 정보 출력 ====");
            System.out.println("이름 : " + e.getName());
            System.out.println("소속 : " + e.getAdd());
            System.out.println("전화 : " + e.getPhone());
            System.out.println("메일 : " + e.geteMail());
        }
    }
}
