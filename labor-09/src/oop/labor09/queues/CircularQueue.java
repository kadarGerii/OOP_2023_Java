package oop.labor09.queues;

import oop.labor09.interfaces.IQueue;

import java.util.ArrayList;
import java.util.List;

public class CircularQueue implements IQueue {
    private final int CAPACITY;
    private final Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return front == rear - 1 || rear == front + 1;
    }

    @Override
    public void enQueue(Object obj) {

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}
