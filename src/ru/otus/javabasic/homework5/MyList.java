package ru.otus.javabasic.homework5;

import java.util.*;

public class MyList {
    private final List<Integer> list = new ArrayList<>();
    private final List<Integer> list2;
    private final int size;

    public MyList(int size) {
        this.size = size;
        arrayInit(this.list);
        this.list2 = new ArrayList<>(this.list);
    }

    private void arrayInit (List<Integer> array){

        for (int i = 0; i < this.size; i++) {
            int x = (int) (Math.random() * size);
            array.add(x);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public void mySortMethod() {
        Date startDate = new Date();
        int min;
        int minIndex;
        int tmp;
        for (int i = 0; i < list.size(); i++) {
            minIndex = i;
            min = list.get(i);
            for (int y = i; y < list.size(); y++) {
                if (list.get(y) < min) {
                    min = list.get(y);
                    minIndex = y;
                }
            }
            tmp = list.get(i);
            list.set(i, min);
            list.set(minIndex, tmp);
        }
        Date endDate = new Date();
        System.out.println("My sorting duration : " + (endDate.getTime() - startDate.getTime()));
    }

    public void defaultSortMethod(){
        Date startDate = new Date();
        Collections.sort(this.list2);
        Date endDate = new Date();
        System.out.println("Default sorting duration : " + (endDate.getTime() - startDate.getTime()));
    }


}
