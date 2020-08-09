package homeWork.lesson5;

public class Dog extends Animal {
    private final double runLenghtLimit ;
    private final double jumpHeightLimit;
    private final double swimLenghtLimit;

    public Dog(String name){
        super(name);
        this.runLenghtLimit = Utilities.rnd(400.00,600.00);
        this.jumpHeightLimit = Utilities.rnd(0.5,2.0);
        this.swimLenghtLimit = Utilities.rnd(5.0,10.0);

    }

    @Override
    public void run(int length) {
        if (length > runLenghtLimit) {
            System.out.println("Собака " + name + " не пробежит "+ length + " м");
        } else {
            System.out.println("Собака " + name + " пробежала "+ length + " м");
        }

    }

    @Override
    public void jump(int height) {
        if (height > jumpHeightLimit) {
            System.out.println("Собака " + name + " не прыгнула на высоту "+ height + " м");
        } else {
            System.out.println("Собака " + name + " прыгнула на высоту "+ height + " м");
        }

    }

    @Override
    public void swim(int length) {
        if (length > jumpHeightLimit) {
            System.out.println("Собака " + name + " не проплылывет "+ length + " м");
        } else {
            System.out.println("Собака " + name + " прыгнула на высоту "+ length + " м");
        }

    }


    public double getRunLenghtLimit() {
        return runLenghtLimit;
    }

    public double getJumpHeightLimit() {
        return jumpHeightLimit;
    }

    public double getSwimLenghtLimit() {
        return swimLenghtLimit;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "runLenghtLimit=" + runLenghtLimit +
                ", jumpHeightLimit=" + jumpHeightLimit +
                ", swimLenghtLimit=" + swimLenghtLimit +
                ", name='" + name + '\'' +
                '}';
    }
}
