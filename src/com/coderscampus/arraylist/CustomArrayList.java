package com.coderscampus.arraylist;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];

    @Override
    public boolean add(T item) {
        // TODO Auto-generated method stub
//        if (items.getClass().getComponentType().isPrimitive()) {
//
//        }
        if items
        Arrays.stream(items).peek((element) -> {
            if (element == null){
                element = item;
            }
        }).peek();
//        boolean isFull = checkIsFull();
//        if (isFull) {
//            extendArray();
//        }
//        for (int i = 0; i < items.length; i++) {
//            if ( items[i] == null ) {
//                items[i] = item;
//                break;
//            }
//        }
//        return false;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return  (int) Arrays.stream(items).count();
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    private boolean checkIsFull(){
        for (int i = 0; i < items.length; i++) {
            if ( items[i] == null ){
                return false;
            }
        }
        return true;
    }

    private void extendArray(){
        Object[] temp = Arrays.copyOf(this.items,items.length*2);
        this.items = temp;
    }

}
