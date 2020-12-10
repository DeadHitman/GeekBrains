package homeWork.Algoritm_5;

public class Main {

    /**
     * 1. Написать программу по возведению числа в степень с помощью рекурсии.
     */

    public static void main(String[] args) {
        int a =2;
        int b =-2;

        System.out.println(recUpDegree(a,b));

    }


    public static double recUpDegree(double a,double b){
        if (b==1){
            return a;
        }
        else if (b==0){
            return 1;
        }
        else if (b<0){
            return (recUpDegree(a,b+1)*1/a);
        }else
        return recUpDegree(a,b-1)*a;
    }
}
