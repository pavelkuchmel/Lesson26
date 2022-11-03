package com.company;

public class ArrayIterator<T> {
    private T[] array;
    private int index;
    ArrayIterator(T[] array){
        this.array = array;
        index = -1;
    }

    public boolean hasNext(){
        return index < array.length;
    }

    public T next() throws Exception{
        if (!hasNext()) throw new Exception("Index out of array bounds");
        return array[index++];
    }

}
