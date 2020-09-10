package homeWork.java1_2.lesson5;

public class ClassThread implements Runnable {
    float [] arr;
    int h;

    public ClassThread(float[] arr,int h){
        this.arr = arr;
        this.h = h;

    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i+h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i+h) / 2));
        }
    }
}
