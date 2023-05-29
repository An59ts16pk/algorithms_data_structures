package SemDZ_3;

/**
     * DZ_3
     * Реализовать следующие методы
     * 1. public int size() - получить размер списка
     * 2. public boolean contains(int value) - проверить наличие элемента в списке
     * 3.* public MyLinkedList reversed() - создать НОВЫЙ список с обратным порядком
     * 4.** Заменить все int значения на дженерик T
     * 5.* Любые другие доработки, которые захотите для тренировки
     */

public class Lesson3 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList);

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(4);
        System.out.println(myLinkedList);
        
        System.out.println();
        System.out.println(myLinkedList.get(0)); // 1
        System.out.println(myLinkedList.get(1)); // 2
        System.out.println(myLinkedList.get(2)); // 3
        System.out.println(myLinkedList.get(3)); // 4
        System.out.println(myLinkedList.get(4)); // 4
        
        System.out.println("\nРазмер связного списка: ");
        System.out.println(myLinkedList.size());
        
        // проверить наличие элемента в списке - true, если нет - false
        System.out.println("\nНаличие элемента в списке: ");
        System.out.println(myLinkedList.contains(3));
        System.out.println(myLinkedList.contains(8));

        // НОВЫЙ список с обратным порядком
        System.out.println("\nНОВЫЙ список с обратным порядком: ");
        System.out.println(myLinkedList.reversed());
    }
}
