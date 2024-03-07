package day3;

public class Method {

    // 함수(메서드) 만들기(정의)
    public static void test() {
        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");
        System.out.println("실행4");
    }

    // main 메서드
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        Person p2 = new Person();
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        // 자기소개 문구를 바꾸고 싶다. 안녕하세요 => 반갑습니다.
        System.out.println("반갑습니다 저는 " + p1.home + "에 사는 " + p1.age + "살 " + p1.name + "입니다.");
        System.out.println("반갑습니다 저는 " + p2.home + "에 사는 " + p2.age + "살 " + p2.name + "입니다.");

        // 메서드(함수)를 이용해 코드를 재활용한다.
        // 함수도 만들어서 사용

        // 함수는 함수 안에 만들 수 없음.
        // 함수는 클래스 밖에 만들 수 없음.

        test(); // test 함수 사용(호출)

        test();

        test();

        // 함수를 사용하면 코드 재사용이 가능하기 때문에 코드량이 줄어듦
        // 실질적인 코드는 하나이기 때문에 수정이 용이
    }
}


// 같은 폴더(패키지) 안에 동일한 이름의 클래스를 만들 수 없다.
// 같은 폴더(패키지) 안의 클래스들은 서로 사용 가능하다
