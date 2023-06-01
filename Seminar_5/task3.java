package Seminar_5;

/*
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

import java.util.*;

//import javax.management.RuntimeErrorException;

public class task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer []{2, 7, null ,null, 4, null};
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        List <Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == null) indexList.add(i);
           
        }
        if (indexList.size() != 0) {
            throw new RuntimeException("Найденые null в яче1ках " + indexList);
        } else System.out.println("В массиве null не найден.");
    }

}
