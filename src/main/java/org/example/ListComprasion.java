package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListComprasion {
    private ArrayList<Integer> array;
    private LinkedList<Integer> link;

    public ListComprasion(){
        array = new ArrayList<>();
        link = new LinkedList<>();
    }

    public ListComprasion(int size) {
        array = new ArrayList<>(size);
        for (int i = 0;i < size; i++) {
            array.add(i,5);
        }
        link = new LinkedList<>();
        for (int i = 0;i < size; i++) {
            link.add(5);
        }
    }

    /**
     * Функция замеряет время добавления элемента в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long addArrayList(int CallsNumber) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++){
            array.add(5);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время добавления элемента в середину массива в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long addMidleArrayList(int CallsNumber) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++){
            array.add(array.size()/2, 5);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время удаления элемента в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long deleteArrayList(int CallsNumber) {
        if (CallsNumber >= array.size()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            array.remove(array.size()-1);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время удаления элемента из середины массива в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long deleteMidleArrayList(int CallsNumber) {
        if (CallsNumber >= array.size()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            array.remove(array.size()/2);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время нахождения последнего элемента в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long getArrayList(int CallsNumber) {
        if (array.isEmpty()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            array.getLast();
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время нахождения среднего элемента в ArrayList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long getMidleArrayList(int CallsNumber) {
        if (array.isEmpty()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            array.get(array.size()/2);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время добавления последнего элемента в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long addLinkedList(int CallsNumber) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++){
            link.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время добавления элемента в середину в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long addMidleLinkedList(int CallsNumber) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++){
            link.add(link.size()/2, 5);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время удаления последнего элемента в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long deleteLinkedList(int CallsNumber) {
        if (CallsNumber >= link.size()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            link.remove(link.size()-1);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время удаления серединного элемента в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long deleteMidleLinkedList(int CallsNumber) {
        if (CallsNumber >= link.size()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            link.remove(link.size()/2);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время получения последнего элемента в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long getLinkedList(int CallsNumber) {
        if (link.isEmpty()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            link.getLast();
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция замеряет время получения серединного элемента в LinkedList
     * @param CallsNumber - количество вызовов
     * @return время выполнения в миллисекундах
     */
    private long getMidleLinkedList(int CallsNumber) {
        if (link.isEmpty()) return 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CallsNumber; i++) {
            link.get(link.size()/2);
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Функция выводит данные с тестами add, delete, get для arrayList и LinkedList
     * @param callNumber - количество вызовов
     */
    public void test(int callNumber){
        System.out.println("test with " + callNumber + " repeats(first - arrayList, second - LinkedList)");

        System.out.print("add: ");
        System.out.println(addArrayList(callNumber) + ", " + addLinkedList(callNumber));

        System.out.print("midle add: ");
        System.out.println(addMidleArrayList(callNumber) + ", " + addMidleLinkedList(callNumber));

        System.out.print("delete: ");
        System.out.println(deleteArrayList(callNumber) + ", " + deleteLinkedList(callNumber));

        System.out.print("midle delete: ");
        System.out.println(deleteMidleArrayList(callNumber) + ", " + deleteMidleLinkedList(callNumber));

        System.out.print("get: ");
        System.out.println(getArrayList(callNumber) + ", " + getLinkedList(callNumber));

        System.out.print("midle get: ");
        System.out.println(getMidleArrayList(callNumber) + ", " + getMidleLinkedList(callNumber));
    }
}
