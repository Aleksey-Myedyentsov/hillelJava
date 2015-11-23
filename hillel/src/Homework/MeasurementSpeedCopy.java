package Homework;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by User on 21.11.2015.
 */
public class MeasurementSpeedCopy {
    public static void main(String[] args) {
        bufferedCopy();
        streemCopy();

    }

    private static void bufferedCopy() {
        long start = System.currentTimeMillis();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/File.txt"), Charset.forName("windows-1251")));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/copyFile.txt"), Charset.forName("windows-1251")))
        ) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                bufferedWriter.write(value + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time stream buffer (mSec): " + time);
    }

    private static void streemCopy() {
        long start = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream("d:/File.txt");
             OutputStream outputStream = new FileOutputStream("d:/copyFile1.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time stream (mSec): " + (time = end - start));
    }

}
