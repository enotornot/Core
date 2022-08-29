package test;

import main.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void checkingTheCorrectnessOfSorting() {

        Main main= new Main();
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        //Expected
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 5, 6, 9};
        //Actual
        main.sortArrays(array);

        assertArrayEquals(array, sortedArray);

    }



}
