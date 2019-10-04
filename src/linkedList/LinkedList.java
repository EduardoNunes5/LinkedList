package linkedList;

import java.util.ArrayList;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = new Node(null, new Node(), new Node());
    }

    // ********************METODOS RECURSIVOS******************** //

    public void addLast(int element){

        if(this.head.isEmpty()){
            this.head.setValue(element);
            this.head.setPrevious(new Node());
            this.head.setNext(new Node());
        }
        else
            addLast(this.head, element);
    }

    private void addLast(Node node, int element){
        if(node.getNext().isEmpty()){
            Node newNode = new Node(element, node, new Node());
            node.setNext(newNode);
        }
        else
            addLast(node.getNext(), element);
    }

    public int size(){
        if(this.head.isEmpty()) return 0;

        else
            return 1 + size(this.head);
    }

    private int size(Node node){
        if(node.getNext().isEmpty()) return 0;
        else
            return 1 + size(node.getNext());
    }

    public int soma(){
        if(this.head.isEmpty()) return 0;

        return this.head.getValue() + soma(this.head);
    }

    private int soma(Node node){
        if(node.getNext().isEmpty()) return 0;

        return node.getNext().getValue() + soma(node.getNext());
    }

    public boolean isSorted(){
        if(this.head.isEmpty()) return true;

        return isSorted(this.head.getNext());
    }

    private boolean isSorted(Node node){
        if(node.isEmpty()) return true;

        if(node.getValue() < node.getPrevious().getValue()) return false;

        return isSorted(node.getNext());
    }

    // ITERATIVE METHODS //

    public void add(int index,int element){
        if(index < 0 || index > size()) return;

        if (index == size()){
            addLast(element);
            return;
        }
        else if (index == 0){
            addFirst(element);
        }
        else {
            Node toNext = search(index);
            Node newNode = new Node(element, toNext.getPrevious(), toNext);
            newNode.getPrevious().setNext(newNode);
            toNext.setPrevious(newNode);
        }


    }

    private void addFirst(int element){
        if(this.head.isEmpty()){
            this.head = new Node (element, new Node(), new Node());
        }
        else{
            Node newNode = new Node(element, new Node(), this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
    }

    public void remove(int index){
        Node toRemove = search(index);
        if(toRemove == null || toRemove.isEmpty()) return;

        if(toRemove == this.head){
            this.head = this.head.getNext();
        }
        else {
            toRemove.getPrevious().setNext(toRemove.getNext());
            toRemove.getNext().setPrevious(toRemove.getNext());
        }
    }


    private Node search(int index){

        if(index == 0)  return this.head;

        Node aux = this.head;
        int counter = 0;
        while(!aux.isEmpty() && counter < index){
            aux = aux.getNext();
            counter++;
        }

        return aux;
    }


    //method only for checking whether removing or adding is working correctly or not in test class.
    public int[] toArray(){
        ArrayList<Integer> al = new ArrayList<>();
        Node aux = this.head;
        while(!aux.isEmpty()){
            al.add(aux.getValue());
            aux = aux.getNext();
        }

        return al.stream().mapToInt(Integer::intValue).toArray();
    }

}
