package oop.labor09.queues.models;

import oop.labor09.queues.interfaces.IQueue;

import java.util.Arrays;
import java.util.Objects;

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
        return front == 0 && rear == CAPACITY - 1 || rear == front - 1;
    }

    @Override
    public void enQueue(Object obj) {
        if(isFull()){
            System.out.println("It's full!");
            return;
        }
        rear = (rear + 1) % CAPACITY;
        items[rear] = obj;
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("It's empty!");
            return null;
        }
        Object save = items[front];
        if(front == rear){
            front = rear - 1;
        }
        else front = (front + 1) % CAPACITY;
        return save;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if(that.CAPACITY != CAPACITY)
            return false;
        int i,j;
        for( i = this.front, j = that.front; i != this.rear && j != that.rear; i = (i+1) % this.CAPACITY, j = (j+1) % that.CAPACITY){
            if(this.items[i] != that.items[j])
                return false;
        }
        if(this.items[this.rear] != that.items[that.rear])
            return false;
        if(i != this.rear || j != that.rear)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(front, rear);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    @Override
    public void printQueue() {

    }
}
