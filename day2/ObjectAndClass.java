package day2;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 객체 -> 폴더

        // 사람 표현
        // 이름, 나이, 거주지

        // 사람 1명
        String name = "홍길동";
        int age = 20;
        String home = "서울";


        String name2 = "이순신";
        int age2 = 30;
        String home2 = "부산";

        System.out.println(home + " 사는 " + age + "살 " + name + "입니다.");
        System.out.println(home2 + " 사는 " + age + "살 " + name2 + "입니다.");

        // 이순신 정보 복사
        String name3 = name2;
        int age3 = age2;
        String home3 = home2;


        // ======================================================================

        // 홍길동이 자기 정보를 기입
        // 이력서 원본 복사
        Person p1 = new Person();

        // 복사본에다가 홍길도의 정보를 기입
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        // 이순신 자기 정보를 기입
        // 이력서 원본 복사
        Person p2 = new Person();

        // 복사본에다가 이순신 정보를 기입
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";


        // 홍길동 자기소개
        System.out.println(p1.home + " 사는 " + p1.age + "살 " + p1.name + "입니다.");

        // 이순신 자기소개

        // 객체 복사
        Person p3 = p2;
        System.out.println(p3.name);


        // 자동차 1개 생성
        Car c1 = new Car();
        c1.model = "소나타";
        c1.year = 2020;
        c1.price = 3000;
    }
}

// 새로운 클래스 생성
class Person {
        String name; // 8바이트
        int age; // 4바이트
        String home; // 8바이트
}

class Car {
    String model;
    int year;
    int price;
}
