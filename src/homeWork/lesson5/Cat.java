package homeWork.lesson5;

public class Cat extends Animal {
    private final double runLenghtLimit;
    private final double jumpHeightLimit;

    public Cat(String name) {
        super(name);
        this.runLenghtLimit = Utilities.rnd(150.0,250.0);
        this.jumpHeightLimit = Utilities.rnd(3.0,5.0);;

    }

    @Override
    public void run(int length) {
        if (length > runLenghtLimit) {
            System.out.println("Котик " + name + " не пробежит "+ length + " м");
        } else {
            System.out.println("Котик " + name + " пробежал "+ length);
        }
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeightLimit) {
            System.out.println("Котик " + name + " не прыгнул на высоту "+ height + " м");
        } else {
            System.out.println("Котик " + name + " прыгнул на высоту "+ height + " м");
        }

    }


    public double getRunLenghtLimit() {
        return runLenghtLimit;
    }

    public double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "runLenghtLimit=" + runLenghtLimit +
                ", jumpHeightLimit=" + jumpHeightLimit +
                ", name='" + name + '\'' +
                '}';
    }
}
