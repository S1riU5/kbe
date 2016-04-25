package de.htw_berlin.ai_bachelor.kbe.tree;

/**
 * Created on 07/12/15.
 */
public interface TreePredicate<V> {

    boolean isOk(Tree<V> tree);
}
