package de.htw_berlin.ai_bachelor.kbe.tree;


import java.util.*;

public class TreeTest {
    public static void main(String... a) {

        Tree<Integer> t4 = new Tree<>(65, null, null);
        Tree<Integer> t3 = new Tree<>(42, null, null);
        Tree<Integer> t2 = new Tree<>(23, t4, null);
        Tree<Integer> t1 = new Tree<>(1, t2, t3);
        export(t1);

        ComparePredicate<Integer> comparePredicate = new ComparePredicate<>(0, 60);

        System.out.println("Sum Tree: " + TreeSum.sum(t1));

        Collection<Integer> result = filterElement(comparePredicate, t1);

        System.out.println(result);

    }

    private static void export(Tree tree) {
        if (tree != null) {
            System.out.println("Tree value: " + tree.getValue());
            export(tree.getLeft());
            export(tree.getRight());
        }
    }


    //TODO
    private static <V extends Comparable<V>> Collection<V> filterElement(ComparePredicate<V> cmp, Tree<V> tree) {
        Collection compareTree = new ArrayList<V>();
        if (tree != null) {
            if (cmp.isOk(tree)) {
                compareTree.add(tree.getValue());
                compareTree.addAll(filterElement(cmp, tree.getLeft()));
                compareTree.addAll(filterElement(cmp, tree.getRight()));
            }
            filterElement(cmp, tree.getLeft());
            filterElement(cmp, tree.getRight());
        }

        return compareTree;

    }


}
