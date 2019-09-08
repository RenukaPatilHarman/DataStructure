package com.harman.dataStructure;

import java.util.HashSet;

public class LinkedList {
	
	Node head;
	
		// Each time to insert element anywhere, you will need to traverse from head only, 
		// so flag and store head element and each time start traversing from head's next element check only.
		public void insert(int data){
			Node node = new Node();
			node.data = data;
			node.next = null;
			
			if(head == null) {
				head = node;
			} else {
				Node n = head;		
				while(n.next != null){
					n = n.next;
				}
				n.next = node;
			}
	}
	
	public void insertAtFirst(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		
		head = node;
	}
	
	public void insertCircular(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = node;
	}
	
	public void insertAt(int index, int data){
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		int count = 0;
		Node n = head;
		while(n.next != null){
			if(count == index-1){
				node.next = n.next;
				n.next = node;
				break;
			}
			n = n.next;
			count++;
		}
	}
	
	public Boolean isListCircular(){
		
		Node n = head;
		Boolean isListCircular = false;
		
		while(n.next != null){
			n = n.next;
			if(n.next == head){
				isListCircular = true;
				break;
			}
		}
		
		
		return isListCircular;
	}
	
public void insertLoopAt(int index, int data){
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		int count = 0;
		Node n = head;
		while(n.next != null){
			if(count == index){
				node.next = n;
			}
			n = n.next;
			count++;
		}
		n.next = node;
	}
	
	// Using HashSet
	public Boolean isListHasLoop(){
		Boolean isLoopDetected = false;
		Node n = head;
		HashSet<Node> set = new HashSet<Node>();
		
		while(n != null){
			if(n == head){
				set.add(n);
			} else {
				if(set.contains(n)){
					isLoopDetected = true;
					break;
				} else {
					set.add(n);
				}
			}
			n = n.next;
		}
		
		return isLoopDetected;
	}
	
	// Using slow-fast pointer -  Floyd�s Cycle detection algorithm
	public Boolean detectLoop(){
		
		Boolean isLoopDetected = false;
		Node slow = head;
		Node fast = head;
		
		while(slow!=null && fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				isLoopDetected = true;
				break;
			}
		}
		
		return isLoopDetected;
	}
	
	public Boolean detectAndRemoveLoop(){
			
			Boolean isLoopDetected = false;
			Node slow = head;
			Node fast = head;
			
			while(slow!=null && fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
				
				if(slow == fast){
					removeLoop(slow);
				}
			}
			
			return isLoopDetected;
		}
	public void removeLoop(Node slow){
		Node ptr1 = head;
		Node ptr2 = null;
		
		while(1 == 1){
			while(ptr2 != ptr1 && ptr2 != slow){
				
			}
		}
	}
	
	public void show(){
		
		Node n = head;
		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
