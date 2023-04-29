package oop.labor09.queues.models;

import oop.labor09.queues.interfaces.IQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListQueue implements IQueue {
    private final int CAPACITY;
    private List<Object> items;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if(isFull()){
            return;
        }
        items.add(obj);
    }

    @Override
    public Object deQueue() {
        if (isEmpty()){
            return null;
        }
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        for(Object i: items){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return items.equals(that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
