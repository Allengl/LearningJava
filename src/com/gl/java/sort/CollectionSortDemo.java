package com.gl.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(9);
        list.add(8);

        for(Integer i : list) {
            System.out.print("" + i + "\n");
        }

        //升序排列
        Collections.sort(list);

        for (Integer i : list) {
            System.out.print("After Sort" + i + "\n" );
        }
    }
}
