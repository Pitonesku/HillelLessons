package com.company.HomeTask12;

import java.util.Arrays;

interface Filter<ElemType> {
    boolean check(ElemType elem);
}

interface Mapper<ElemType> {
    ElemType map(ElemType elem);
}


class MyList<ElemType> {

    public MyList() {
    }

    ;

    public MyList(ElemType[] list) {
        this.myList = list;
    }

    Object[] myList = new Object[0];
    private int indexOfLastElem = myList.length - 1;
    ;


    public void setList(ElemType[] list) {
        myList = list;
    }

    public int size() {
        int size = myList.length;
        return size;
    }

    public void extendList() {
        if (myList.length == 0) {
            Object[] newList = new Object[1];
            myList = newList;
        } else {
            Object[] newList = new Object[myList.length * 2];
            for (int i = 0; i < myList.length; i++) {
                newList[i] = myList[i];
                myList = newList;
            }
        }
    }

    public void add(ElemType elem) {
        indexOfLastElem++;
        if (myList.length == 0 || myList[myList.length - 1] != null) {
            extendList();
        }
        myList[indexOfLastElem] = elem;
    }

    public int indexOf(ElemType v) {
        int index = -1;
        for (Object o : myList
        ) {
            index++;
            if (v.equals(o)) break;
        }
        return index;
    }

    boolean all(Filter<ElemType> filter) {
        boolean result = true;
        for (Object o : myList
        ) {
            if (!filter.check((ElemType) o)) {
                result = false;
                break;
            }
        }
        return result;
    }

    boolean any(Filter<ElemType> filter) {
        boolean result = false;
        for (Object o : myList
        ) {
            if (filter.check((ElemType) o)) {
                result = true;
                break;
            }
        }
        return result;
    }

    void map(Mapper<ElemType> mapper) {


        for (int i = 0; i < myList.length; i++) {
            myList[i] = mapper.map((ElemType) myList[i]);
        }

  // Почему не работает код ниже???

   /*     for (Object o: myList
             ) {
          o = mapper.map((ElemType) o);
         }
    */

    }

    ;
}

public class MyListTest {
    public static void main(String[] args) {

        MyList<String> myStringList = new MyList<>();
        myStringList.myList = new String[]{"qqq", "www", "eee", "rrr"};
        int i = myStringList.indexOf("www");
        System.out.println(i);

        MyList<Integer> intList = new MyList<>();
        intList.myList = new Integer[]{1, 2, 0, -6, 9,};
        boolean isIt = intList.all(o -> o >= 0);
        System.out.println(isIt);
        intList.map(o -> o / 4);


        System.out.println(Arrays.toString(intList.myList));


        boolean result = intList.any(o -> o < -6);
        System.out.println(result);
    }
}