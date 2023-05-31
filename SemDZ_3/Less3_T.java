package SemDZ_3;

// 4.** Заменить все int значения на дженерик T

public class Less3_T {
    public static void main(String[] args) {
        MyLinkedList_T<Integer> myLinkedList_T = new MyLinkedList_T<>();

        System.out.println(myLinkedList_T);
        myLinkedList_T.add(1);
        myLinkedList_T.add(2);
        myLinkedList_T.add(3);
        myLinkedList_T.add(4);
        myLinkedList_T.add(4);
        System.out.println(myLinkedList_T);

        System.out.println("\nРазмер связного списка: ");
        System.out.println(myLinkedList_T.size_T);

        // проверить наличие элемента в списке - true, если нет - false
        System.out.println("\nНаличие элемента в списке: ");
        System.out.println(myLinkedList_T.contains(3));
        System.out.println(myLinkedList_T.contains(8));

        // НОВЫЙ список с обратным порядком
        System.out.println("\nНОВЫЙ список с обратным порядком: ");
        MyLinkedList_T<Integer> myLinkedListRevers = new MyLinkedList_T<>();
        myLinkedListRevers = myLinkedList_T.reversed();
        System.out.println(myLinkedListRevers);

        // новый список с обратным порядком рекурсивно
        System.out.println("\nНОВЫЙ список с обратным порядком рекурсивно: ");
        MyLinkedList_T<Integer> myLinkedListRecursiv = new MyLinkedList_T<>();
        myLinkedListRecursiv = myLinkedList_T.reversed_T();
        System.out.println(myLinkedListRecursiv);
    }
}
