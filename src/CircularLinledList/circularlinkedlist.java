package CircularLinledList;

import SinglyLinkedList.SinglyLinkedList;

public class circularlinkedlist<E> {

    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


    private Node<E> Tail;
    private int size;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public circularlinkedlist() {
        Tail=null;
        size=0;
    }
    public void addFirst(E data){
        if(isEmpty()){
            Node<E> newNode=new Node(data,next:null);
            tail=newNode;

        }

        public void getLast()
    }







































































    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
}
