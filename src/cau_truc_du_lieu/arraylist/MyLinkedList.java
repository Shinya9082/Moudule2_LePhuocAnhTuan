package cau_truc_du_lieu.arraylist;

import java.util.EmptyStackException;

public class MyLinkedList<E> {
    Node head;
    int numNodes=0;
    public MyLinkedList(){
        head=null;
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index,E element){
        if(index<0|| index>numNodes){
            throw new IndexOutOfBoundsException();
        }
        Node temp =head;
        Node holder;
        for (int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;

    }
    public void addFirst(E element){
        Node temp=head;
        head=new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next= new Node(element);
        numNodes++;
    }
    public E remove(int index){
        if(index<0|| index>numNodes){
            throw new IndexOutOfBoundsException();
        }
        Node temp=head;
        Object data;

        if (index==0){
            data=temp.getData();
            head=head.next;
        }else {
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            data=temp.next.getData();
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E)data;
    }
    public boolean remove(E element){
        if((E)head.getData()==element){
            remove(0);
            return true;
        }
        Node temp=head;
        do{
            if ((E)temp.next.getData()==element){
                temp.next=temp.next.next;
                numNodes--;
                return true;
            }
            temp=temp.next;
        }while (temp.next!=null);
        return false;
    }
    public int size(){
        return numNodes;
    }
    public MyLinkedList clone(){
        if(numNodes==0){
            throw new NullPointerException();
        }
        MyLinkedList<E> temp= new MyLinkedList<E>();
        Node tempNode= head;
        do{
            temp.addLast((E)tempNode.getData());
            tempNode=tempNode.next;
        }while (tempNode!=null);
        return temp;
    }
    public boolean contains(E element){
        Node temp= head;
        do {
            if ((E)temp.getData()==element){
                return true;
            }
            temp=temp.next;
        }while (temp!=null);
        return false;
    }
    public int indexOf(E element){
        Node temp= head;
        for (int i=0;i<numNodes-1;i++){
            if((E)temp.getData()==element)
                return i;
            temp=temp.next;
        }
        return -1;
    }
    public void printList(){
        Node temp = head;
        do{
            System.out.println(temp.getData());
            temp=temp.next;
        }while (temp!=null);
        System.out.println();
    }


    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList= new MyLinkedList<Integer>();
        linkedList.addFirst(0);
        linkedList.addLast(1);
        linkedList.printList();

        linkedList.add(1,3);
        linkedList.printList();

        linkedList.add(2,4);
        linkedList.printList();

//        System.out.println("Remove: "+linkedList.remove(1));
//        linkedList.printList();
//        System.out.printf("Remove element 1: %s", linkedList.remove((Integer) 0));
//        System.out.println();
//        linkedList.printList();

    }
}
