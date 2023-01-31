package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// 내부의 정보 저장용으로 사용, 키와 값이 모두 String 타입으로 제한됨
// HashTable 의 하위클래스임

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesEx.class.getResource("../database.properties").getPath(); // 절대 경로를 가져옴
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("드라이버 : " + driver);
        System.out.println("url : " + url);
        System.out.println("이름 : " + username);
        System.out.println("비밀번호 : " + password);
    }
}
