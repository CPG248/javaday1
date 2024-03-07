package day4;

public class Inhertiance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();

        a1 = c1;
        Cat c2 = (Cat)a1;
    }
}

class Animal
{

}
class Cat extends Animal
{

}
class Dog extends Animal
{}

