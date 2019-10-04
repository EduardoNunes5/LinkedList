package linkedList;

public class Node {

    private Integer value;
    private Node next;
    private Node previous;

    public Node(){

    }

    public Node(Integer value, Node prev, Node next){
        this.value = value;
        this.next = next;
        this.previous = prev;
    }

    public Node(int value){
        this.value = value;
    }

    public Node getNext(){
        return this.next;
    }

    public Node getPrevious(){
        return this.previous;
    }

    public void setPrevious(Node node){
        this.previous = node;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public Integer getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    public boolean isEmpty(){
        return this.value == null;
    }
}
