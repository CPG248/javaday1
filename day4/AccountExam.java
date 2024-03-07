package day4;

public class AccountExam {
    public static void main(String[] args) {
        Account a1 = new Account();


        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);

        int remainder = a1.getRemainder();

        money = a1.withdraw(1400);

        remainder = a1.getRemainder();
    }
}
