package de.htw_berlin.ai_bachelor.kbe.tree;

/**
 * Created on 07/12/15.
 */
public class ComparePredicate<V extends Comparable<V>> implements TreePredicate<V> {

    private V minElem;
    private V maxElem;

    public ComparePredicate(V minElem, V maxElem) {
        this.minElem = minElem;
        this.maxElem = maxElem;
    }

    @Override
    public boolean isOk(Tree<V> tree) {
        return tree.getValue().compareTo(minElem) > 0 && tree.getValue().compareTo(maxElem) < 0;
    }
}
