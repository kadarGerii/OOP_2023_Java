package oop.labor09.interfaces;

public interface IQueue {
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object obj);
    Object deQueue();
    void printQueue();
}
