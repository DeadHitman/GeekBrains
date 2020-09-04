package homeWork.java1_1.lesson1;

public class Lesson1 {


    public static void main(String[] args) {

//        System.out.print("Hello world ");
//        System.out.println("Second String");


        int userInputX = 6;
        int userInputY = 2;

        checkCoordinates(6, 2);
        checkCoordinates(userInputX, userInputY);

    }


    private static int sumOfThreeNumbers(int x, int y, int z){
        int result = x + y + z;

        return result;
    }


    private static void checkCoordinates(int x, int y) {
        int fieldSizeX = 3;
        int fieldSizeY = 3;


        boolean outOfX = (x >= fieldSizeX) || x < 0;

        if (outOfX) {
            System.out.println("Out of field X");
        } else {
            System.out.println("Put your mark to X");

        }

        if (y >= fieldSizeY || y < 0) {
            System.out.println("Out of field Y");
        } else {
            System.out.println("Put your mark to Y");

        }


    }


}
