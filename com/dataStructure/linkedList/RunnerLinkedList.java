package com.harman.dataStructure;

public class RunnerLinkedList {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(11);
		list.insert(22);
		list.insert(44);
		list.insertAtFirst(42);
		list.insertAt(2, 55);
		
		//	list.insertCircular(21);		// If you will uncomment this, It will be circular list
		System.out.println("Is list Circular : "+list.isListCircular());
	
		//	list.insertLoopAt(2, 66);		// If you will uncomment this, there will be loop in list
		System.out.println("Is loop detected - Using slow-fast pointer : "+list.detectLoop());
		System.out.println("Is loop detected - Using HashSet : "+list.isListHasLoop());
		
		
		list.show();
	}
	
}
