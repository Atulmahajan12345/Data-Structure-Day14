package com.bridgelabz;

public class LinkListService {
	LinkList head;

	public void add(int data) {
		LinkList newNode = new LinkList();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}
}
