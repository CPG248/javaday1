package day3;

public class LocalAndClassVariable {
    public static int test() {
        int num = 10;

        return num;
    }
    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

//        Person.introduce(); // 안녕하세요 저는 20살입니다.
//        Person.addAge(); // 나이 1 증가
//        Person.introduce(); // 안녕하세요 저는 21살입니다.

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";
        p1.home = "서울";

        p1.introduce(); // 자기소개
        p1.addAge(); // 나이 증가
        p1.introduce();

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";
        p2.home = "부산";

        p2.introduce();
        p2.addAge();
        p2.introduce();

        Person.averageAge = 31;

        p1.introduce();
        p2.introduce();

    }
}
