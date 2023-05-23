package SemDZ_2;
// Задача семинара 1

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] numbersArray = new int[]{1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 6};
        System.out.println(Arrays.toString(numbersArray));

        collapse(numbersArray);
    }

    /**
     * Дан отсортированный по возрастанию массив с повторяющимися элементами.
     * Нужно "схлопнуть" повторяющиеся элементы без нарушения порядка
     * [1, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 6] -> [1, 2, 3, 4, 5, 6, _, _, _, _, _, _]
     */
    private static void collapse(int[] arr) {
        
        String[] strArray = new String[arr.length];
        Arrays.fill(strArray, "_");
        
        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                strArray[index] = String.valueOf(arr[i]);
                index++;
            }
        }
        strArray[index] = String.valueOf(arr[arr.length-1]);

        System.out.println(Arrays.toString(strArray));
    }
}
