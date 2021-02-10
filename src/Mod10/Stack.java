package Mod10;

public class Stack {

    private String backButton[];
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        backButton = new String[size];
        top = -1;
    }

    public Stack() {
        size = 1000;
        backButton = new String[size];
        top = -1;
    }

    public String get(int index){
        return backButton[index];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public void push(String element){
        if(isFull()) return;
        top++;
        backButton[top] = element;
    }

    public String pop(){
        if (isEmpty()) return "STACK_ERROR";
        int temp = top;
        top--;
        return backButton[temp];
    }



}
