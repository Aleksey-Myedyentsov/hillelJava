package Homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by User on 21.11.2015.
 */
public class MeasurementSpeedCopy {

    private static void bufferedRead() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/myFile.txt"), Charset.forName("windows-1251")))) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                System.out.println(value);
            }
            //throw new IOException("file blabla.txt not found");
        } catch (IOException e) {
            //  System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
