package com.Bridgelabz.HashMap;

public interface INode<T> {

	 K getKey();
	    void setKey();

	    INode getNext();
	    void setNext(INode<K> tempNode);
}
