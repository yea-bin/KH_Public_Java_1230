package 입출력스트림연습1번;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/입출력스트림연습1번/grade.txt");
        TreeSet<Student> ts = new TreeSet<>();
        Scanner sc = new Scanner(fis);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] strArr = line.split(" ");
            ts.add(new Student(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for (Student e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
        fis.close();
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public int getTotal() {
        return kor + eng + mat;
    }
    String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getTotal() == o.getTotal()) {
            return this.name.compareTo(o.name);
        } else if (this.getTotal() < o.getTotal()) return 1;
        else return -1;
    }
}

