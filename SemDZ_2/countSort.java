package SemDZ_2;
// Задача семинара 2

// Реализовать сортировку подсчётом.

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 10, 10, 1, 4, 2, 1, 10 };
        System.out.println(Arrays.toString(arr));
 
        // максимальное число в массиве
        int k = 10;
 
        countingSort(arr, k);
        System.out.println(Arrays.toString(arr));
        
    }

    /**
    * Реализовать сортировку подсчётом.
    */
    static void countingSort(int[] array, int k) {
        // для хранения отсортированного массива
        int[] outsort = new int[array.length];

        // значение каждого элемента входного массива в качестве индекса,
        // сохраняем счетчик каждого целого числа в freq[]
        int[] freq = new int[k + 1];
        for (int i: array) {
            freq[i]++;
        }

        // вычисляем начальный индекс для каждого целого числа
        int total = 0;
        for (int i = 0; i < k + 1; i++) {
            int oldCount = freq[i];
            freq[i] = total;
            total += oldCount;
        }

        // копируем в массив - outsort[]
        for (int i: array) {
            outsort[freq[i]] = i;
            freq[i]++;
        }

        // копируем отсортированный массив обратно во входной массив
        Arrays.setAll(array, i -> outsort[i]);
    }
}
