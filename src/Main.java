import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1 ===");
        int[] inputArray1 = {15000, 22000, 18500, 31000, 12500};
        float sum = 0;
        float max = inputArray1[0];
        float min = inputArray1[0];

        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }
        float average = sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, average};

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        // Задача 2
        System.out.println("\n=== Задача 2 ===");
        int[] inputArray2 = {45000, 60000, 82500, 35000, 100000};
        float[] outputArray2 = new float[inputArray2.length];
        int index2 = 0;

        for (int salary : inputArray2) {
            outputArray2[index2] = salary * 0.13f;
            index2++;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        // Задача 3
        System.out.println("\n=== Задача 3 ===");
        int[] inputArray3 = {4500, 7200, 5000, 12000, 3100};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;

        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
        }

        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        // Задача 4
        System.out.println("\n=== Задача 4 ===");
        int[] inputArray4 = {15000, 8200, -500, 12000, 9400};
        boolean isAlwaysPositive = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                isAlwaysPositive = false;
                break;
            }
        }
        boolean[] outputArray4 = {isAlwaysPositive};

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        // Задача 5
        System.out.println("\n=== Задача 5 ===");
        int[] inputArray5 = {120000, -45000, 0, 310000, 85000};
        int profitableMonthsCount = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonthsCount++;
            }
        }
        int[] outputArray5 = {profitableMonthsCount};

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    }
}
