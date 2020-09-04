package homeWork.java1_1.Lesson6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Lesson6 {

    private final static String NUM = "1234567890";
    private final static String ENG = "abcdefghjklmnopqrstuvwxyz";
    private final static String SUM = NUM + ENG;

    private static File file1 = new File("file1.txt");
    private static File file2 = new File("file2.txt");
    private static File sumFile = new File("sumFile.txt");

    private static File bookFile = new File("Jhon Cena.txt");


    public static void main(String[] args) {

        try {
            FileOutputStream fos1 = new FileOutputStream(Lesson6.file1);
            FileOutputStream fos2 = new FileOutputStream(Lesson6.file2);

            for (int i = 0; i < 1000; i++) {

                if (i == 0) {
                    fos1.write("Insert File1 \n".getBytes());
                } else if (i < 500) {
                    fos1.write(randomLine().getBytes());

                } else if (i == 500) {
                    fos2.write("Insert File2 \n".getBytes());
                } else {
                    fos2.write(randomLine().getBytes());
                }
            }
            fos1.flush();
            fos2.flush();

            fos1.close();
            fos2.close();


//            Lesson6.writeAnotherFile(file1, sumFile);
//            Lesson6.writeAnotherFile(file2, sumFile);


            System.out.println(Lesson6.matcherWords(bookFile));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static char randomChar() {

        Random random = new Random();
        int index = random.nextInt(SUM.length());

        return SUM.charAt(index);
    }

    public static String randomLine() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < random.nextInt(10); i++) {
            sb.append(Lesson6.randomChar());

        }
        sb.append("\n");
        return sb.toString();

    }


    /**
     * 2.Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
     *
     * @param file
     * @param anotherFile
     * @throws IOException
     */
    public static void writeAnotherFile(File file, File anotherFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(anotherFile, true);
        int b;

        while ((b = fileInputStream.read()) != -1) {

            fileOutputStream.write(b);


        }
        fileOutputStream.flush();

        fileInputStream.close();
        fileOutputStream.close();


    }

    /**
     * 3.Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static boolean matcherWords(File file) throws IOException {

        BufferedReader inputFile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        Scanner console = new Scanner(System.in);


        System.out.println("Введите слово: ");
        String word = console.nextLine();
        while (inputFile.ready()) {
            String line = inputFile.readLine();

            if (line.contains(word))

                return true;

        }
        inputFile.close();
        console.close();

        return false;
    }
}


