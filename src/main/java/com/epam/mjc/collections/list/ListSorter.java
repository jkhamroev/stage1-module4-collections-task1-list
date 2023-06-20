package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        if (func(a) < func(b)) {
            return -1;
        }
        if (func(a) > func(b)) {
            return 1;
        }
        return Integer.compare(a, b);
    }

    private int func(int x) {
        return 5 * x * x + 3;
    }
}
