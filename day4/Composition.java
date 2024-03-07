package day4;

public class Composition
{
    public static void main(String[] args)
    {
        Company com = new Company();

        com.Work();
    }
}
class Hong
{
    Kong k = new Kong();
    public void java()
    {
        System.out.println("자바");
    }
}

class Kong
{
    public void python()
    {
        System.out.println("파이썬");
    }
}

class Company
{
    Hong h = new Hong();
    Kong k = new Kong();
    public void Work()
    {
        h.java();
        k.python();
    }
}
