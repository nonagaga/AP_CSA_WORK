package Mod10;

public class Queue {
    private int[] list;
    private int size;
    private int front;
    private int rear;

    public Queue() {
        list = new int[1000];
        front = -1;
        rear = 0;
    }

    public void inQueue(int number){
        list[rear] = number;
        rear++;
    }

    public int deQueue(){
        int temp = front;
        front++;
        return list[temp];
    }
}
