package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	    final ArrayList<Integer> a1 = new ArrayList<>();
        final ArrayList<Integer> a2 = new ArrayList<>(a1);

        fill(10, a1);

        /*System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);*/

        change(a1, a2);

        /*System.out.println("a1= " + a1);
        System.out.println("a2= " + a2);*/

        Iterator<Integer> it = a2.iterator();

        /*while (it.hasNext()){
            System.out.print(it.next() + " ");
        }*/

    }
    static void fill(int quantity, ArrayList<Integer> name){
        Random rdm = new Random();
        for (int i = 0; i < quantity; i++){
            name.add(rdm.nextInt(100));
        }
    }
    static void change(ArrayList<Integer> name1, ArrayList<Integer> name2){
            name2.addAll(name1);
            name1.clear();
    }
}
