package day2;

public class Array {
    public static void main(String[] args) {

        // 값이 많아지면 변수가 많아지고 변수가 많아지면 힘들다
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;

        // 모든 변수를 출력.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // 배열을 사용하면 변수를 하나로 묶을 수 있다.

        // 배열 선언
        int[] num = {10, 20, 30, 40, 50, 60, 70};

        // 배열은 순서(index)에 따라 값을 꺼낼 수 있다.
        // 배열의 시작인덱스는 0부터
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);

        // 배열은 length라는 길이 정보를 가지고 있다.
        System.out.println(num.length);

        // 0 부터 6까지 수열 만들기
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // 배열을 미리 만들어 놓고 저장하기

        // 10개짜리 배열 만든다.
        // 자료형[개수]
        int[] arr = new int[10];

        // 3번째 인덱스에 100을 저장
        arr[2] = 100;

        // 문자열 3개 저장하는 배열 만들어보세요
        String[] strArr = new String[3];

        int[] arr2 = new int[3];

        arr2[0] = 10;
        arr2[1] = 20;


    }
}
