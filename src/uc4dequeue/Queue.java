package uc4dequeue;

import uc2peakpop.Stack;

public class Queue {
    
    public class QNode {

        int qKey;
        QNode next;

        public QNode(int qKey) {

            this.qKey = qKey;
            this.next = null;
        }


    }
    QNode front, rear;

    public Queue() {
        this.front = null;
        this.rear = null;

    }
    public void enQueue(int key) {
        QNode temp = new QNode(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public void printList() {
        System.out.println("Queue Elements are ");
        QNode temp = front;
        while (temp != null) {
            System.out.print(temp.qKey + "\t");
            temp = temp.next;
        }
        System.out.println("");
    }
    public void deleteFront() {
        System.out.println("Deleting Front Element " );
        QNode temp = front;
        if (temp != null) {
            front = temp.next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Stack And Queue ");

        Stack stack = new Stack();

        stack.addElement(56);
        stack.addElement(30);
        stack.addElement(76);

        stack.display();
        stack.peak();
        stack.pop();

        stack.peak();
        stack.pop();

        stack.peak();
        stack.pop();
        stack.display();
        Queue queue = new Queue();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.printList();
        System.out.println("Queue front " +queue.front.qKey);
        System.out.println("Queue rear " +queue.rear.qKey);
        queue.deleteFront();
        queue.printList();
    }

}
