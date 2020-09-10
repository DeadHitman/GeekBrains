package homeWork.java1_2.lesson5;

public class Application  {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    static float[] a1 = new float[h];
    static float[] a2 = new float[h];


    public static void main(String[] args) {
        monoThreading(arr);
        multiThreading(arr);
    }

    public static void monoThreading(float arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;

        }

        long time = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long deltaTime = System.currentTimeMillis() - time;

        System.out.println(deltaTime + " ms");
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];

        }
        System.out.println(sum);

    }


    public static void multiThreading(float arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;

        }
        Thread thread1 = new Thread(new ClassThread(a1,0));
        Thread thread2 = new Thread(new ClassThread(a2,h));

        long time = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);


        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long deltaTime = System.currentTimeMillis() - time;
        System.out.println(deltaTime + " ms");


        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];

        }
        System.out.println(sum);





    }


}
