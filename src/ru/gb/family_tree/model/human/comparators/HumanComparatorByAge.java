package ru.gb.family_tree.model.human.comparators;

import ru.gb.family_tree.model.tree.TreeItem;

import java.util.Comparator;

public class HumanComparatorByAge<E extends TreeItem> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.age(), o2.age());
    }

}
