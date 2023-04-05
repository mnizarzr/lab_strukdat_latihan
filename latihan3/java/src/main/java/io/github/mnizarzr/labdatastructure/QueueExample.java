package io.github.mnizarzr.labdatastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("Remove\t: " + queue.remove());
        System.out.println("Element\t: " + queue.element());
        System.out.println("Poll\t: " + queue.poll());
        System.out.println("Peek\t: " + queue.peek());
        System.out.println("Queue\t: " + queue);
    }

}
