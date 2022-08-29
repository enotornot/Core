import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        fillAndPrintArraysWithRandomNumbers(array);
        calculationMinMaxAverageValueToArrays(array);
    }

    public static int[][] fillAndPrintArraysWithRandomNumbers(int[][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }

    public static void calculationMinMaxAverageValueToArrays(int[][] array) {
        int min = array[0][0];
        int max = array[0][0];
        int amount = 0;
        int average = 0;
        int indexCounter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                indexCounter++;
                amount += array[i][j];
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        average = amount / indexCounter;
        System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max + "\nСреднее значение: " + average);
    }
}