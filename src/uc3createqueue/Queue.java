package uc3createqueue;

import uc2peakpop.Stack;

public class Queue {
    QNode front ,rear;

    public Queue() {
        this.front = null;
        this.rear = null;

    }
    public void enQueue(int key) {
        QNode temp = new QNode(key);

        if(this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public class QNode {

        int qKey;
        QNode next;


        public QNode(int qKey) {

            this.qKey = qKey;
            this.next = null;
        }


    }
    public static void main(String[] args) {
        System.out.println("Stack And Queue ");

        Stack stack = new Stack();

        stack.addElement(56);
        stack.addElement(30);
        stack.addElement(70);


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

        System.out.println("Queue front " +queue.front.qKey);

        System.out.println("Queue rear " +queue.rear.qKey);
    }
}

