package homeWork.lesson5;

public class Animal {
    String name;


    public Animal(String name){
        this.name=name;
    }


    protected void run(int length) {
        System.out.println("Животное " + name + " не умеет бегать");

    }

    protected void jump(int height) {
        System.out.println("Животное " + name + " не умеет прыгать");

    }

    protected void swim(int length) {
        System.out.println("Животное " + name + " не умеет плавать");
    }



}
