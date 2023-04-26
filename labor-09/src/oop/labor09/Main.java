package oop.labor09;

import oop.labor09.interfaces.IDictionary;
import oop.labor09.interfaces.IQueue;
import oop.labor09.models.ArrayListDictionary;
import oop.labor09.queues.ArrayListQueue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*IQueue queue = new ArrayListQueue(5); // new CircularQueue( 5 );
        Random rnd = new Random();
        for (int i = 0; i < 100; ++i) {
            int value = rnd.nextInt(100);
            if (value < 50) {
                System.out.println("Add: " + i);
                queue.enQueue(i);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Cannot delete from an empty queue");
                } else {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }

        IQueue q1 = new ArrayListQueue(5);
        IQueue q2 = new ArrayListQueue(10);
        for( int i=0; i<5; ++i){
            q1.enQueue( i );
            q2.enQueue( i );
        }
        System.out.println( q1.equals( q2 ));*/
        IDictionary arrayListDictionary = ArrayListDictionary.newInstance();
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + arrayListDictionary.find(word));
        }
        scanner.close();
    }
}
