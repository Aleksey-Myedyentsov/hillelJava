package TDD;

import OOP.Cat;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MFarsikov on 19.10.2015.
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder() {
        Integer[] unsorted = {111, 999, 777, 333, 444, 666, 888, 222, 555};

        Sorter sorter = new Sorter();
        Integer[] sorted = (Integer[]) sorter.sort(unsorted);

        Integer[] expected = {111, 222, 333, 444, 555, 666, 777, 888, 999};

        Assert.assertArrayEquals("Sorting is broken", expected, sorted);

    }

    @Test
    public void catsShouldBeSortedByName() {
        Cat cat = new Cat(false, 2, "Tom", "black");
        Cat cat2 = new Cat(false, 2, "Cats name", "White");

        Cat[] cats = {cat, cat2};

        Sorter sorter = new Sorter();
        Cat[] sorted = (Cat[]) sorter.sort(cats);

        Cat[] expected = {cat2, cat};

        Assert.assertArrayEquals("cats arent sorted", expected, sorted);
    }

    @Test
    public void sourceArrayShouldBeUnsorted() {
        Integer[] unsorted = {111, 999, 777, 333, 444, 666, 888, 222, 555};
        Integer[] expected = {111, 999, 777, 333, 444, 666, 888, 222, 555};

        Sorter sorter = new Sorter();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Source array is sorted", expected, unsorted);
    }

}