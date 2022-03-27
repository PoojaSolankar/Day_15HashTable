package com.Bridgelabz.HashMap;

public class MyLinkedList<K>{
	public   INode<K> head;
    public   INode<K> tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void add(INode myNode) {
        if(this.tail == null){
            this.tail=myNode;
        }
        if(this.head== null){
            this.head=myNode;

        }else{
            INode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode){
        if(this.head == null){
            this.head=myNode;
        }
        if(this.tail== null){
            this.tail=myNode;
        }else{
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    
    public INode pop(){
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode<K> popLast(){
        INode<K> tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();

        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public void size(){
        int counter = 1;
        INode tempNode = this.head;
        while(tempNode != this.tail) {
            if (tempNode.getNext() == null) {

            } else {
                tempNode = tempNode.getNext();
                counter++;
            }

        }
        System.out.println("Size of current Linked List is: "+counter);
    }
    
    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while(tempNode != null && tempNode.getNext() !=null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;

            }
            tempNode=tempNode.getNext();
        }
        return null;
    }
   
    public  void printMyNodes(){
        System.out.println("My Nodes:" + head);

    }

    @Override
    public String toString() {
        return "MyLinklistNodes{"+ head +'}';
    }

}
