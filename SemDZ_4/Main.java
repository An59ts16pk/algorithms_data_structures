package SemDZ_4;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(12);
        tree.add(6);
        tree.add(2);
        tree.add(8);
        tree.add(9);
        tree.add(10);
        tree.add(13);
        tree.add(14);
        tree.add(1);

        tree.printTree();

    }
}
