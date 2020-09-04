package homeWork.java1_1.lesson5;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        System.out.println(cat.toString());
        cat.swim(200);
        cat.jump(1);

        Dog dog = new Dog("Spike");
        System.out.println(dog.toString());

        Dog dog1 = new Dog("Bobik");
        System.out.println(dog1.toString());
        dog.jump(1);
        dog1.run(100);

    }
}
