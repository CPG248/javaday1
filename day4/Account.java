package day4;

public class Account {

    int saveMoney = 0;

    void deposit(int money)
    {
        saveMoney += money;
        System.out.println("입금 : " + money );
    }

    int withdraw(int money)
    {
        saveMoney -= money;
        System.out.println("출금 : " + money);
        return money;
    }

    int getRemainder()
    {
        System.out.println("남은 금액 : " + (saveMoney));
        return saveMoney;
    }
}
