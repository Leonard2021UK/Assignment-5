package com.coderscampus.arraylist;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];

    @Override
    public boolean add(T item) {

        boolean arayIsFull = checkIsFull();

        if (arayIsFull) {
            System.out.println("ARRAY IS FULL SO I AM EXTENDING IT");
            extendArray();
        }
        AtomicInteger index = new AtomicInteger();
        // Find the position of the first null value in the array
        // and assign the new item in to that position
        Arrays.stream(items)
                .takeWhile(element -> {
                    final int i = index.incrementAndGet();
                    if ( element == null ){
                        items[i] = item;
                        return true;
                    }
                    return false;
                });


//        for ( int i = 0; i < items.length; i++ ) {
//            if ( items[i] == null ) {
//                items[i] = item;
//                break;
//            }
//        }
        return true;
    }

    /**
     * Returns the true size of the array
     * @return
     */

    @Override
    public int getSize() {
        return  (int) Arrays.stream(items).filter((item) -> item != null).count();
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        if ( index > getSize() )
            throw new IndexOutOfBoundsException();
        return (T) items[index];
    }

    /**
     * Checks wheter the array is full
     * The array considered to be empty until
     * at least a null value is stored in it
     * @return
     */
    private boolean checkIsFull(){
       return Arrays.stream(items)
                .allMatch(item->item != null);
//                .takeWhile(item -> item != null);

//        for (int i = 0; i < items.length; i++) {
//
//            //if null value is found the array is not full
//            if ( items[i] == null ){
//                return false;
//            }
//        }
//        return true;
    }

    /**
     * extends (doubles) the size of the backing array if the current size is not enough
     */
    private void extendArray(){
        Object[] temp = Arrays.copyOf(this.items,items.length*2);
        this.items = temp;
    }

    /**
     * ToString method is overriden for testing pourpouses
     * @return
     */
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
