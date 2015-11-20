package TDD;

import java.util.Arrays;


public class Sorter {
    public Comparable[] sort(Comparable[] array) {
        Comparable[] copy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {

                Comparable first = copy[i];
                Comparable second = copy[j];

                int g = first.compareTo(second);

                if (g > 0) {
                    Comparable temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }
}