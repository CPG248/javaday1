package day4;

public class WarriorSimulation {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.

    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 공격() {
        a무기.SetInformation();
        System.out.println(이름 + "이/가 " + a무기.무기이름 + "로 " + a무기.데미지 + "의 데미지를 입힙니다.");
    }

    void 스킬사용() {
        a무기.SetInformation();
        System.out.println(이름 + "이/가 " + a무기.스킬이름 + " 스킬을 사용합니다.\n" +
                ((double) a무기.데미지 * a무기.배수) + "(" + a무기.배수 + ")" + "의 피해를 입힙니다.");
    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}

class 무기 {
    String 무기이름 = "";
    String 스킬이름 = "";
    int 데미지 = 0;
    double 배수 = 0;

    public void SetInformation() {
    }
}

class 칼 extends 무기 {
    public void attack()
    {
        System.out.println("칼로 공격하여 " + 15 + "의 데미지를 입힙니다.");
    }
    public void skill()
    {
        System.out.println("연속베기로 " + 30 + "(2배) 의 피해를 입힙니다.");
    }

   public void SetInformation() {
        무기이름 = "칼";
        스킬이름 = "연속 베기";
        데미지 = 15;
        배수 = 2;
    }
}

class 활 extends 무기 {
    public void attack()
    {
        System.out.println("활로 공격하여 10 의 데미지를 입힙니다.");
    }
    public void skill()
    {
        System.out.println("불화살으로 15(1.5배)의 피해를 입힙니다.");
    }


    public void SetInforamtion() {
        무기이름 = "활";
        스킬이름 = "불화살";
        데미지 = 10;
        배수 = 1.5;
    }
}
