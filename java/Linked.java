package Link;

import java.util.LinkedList;

class Linked_1 {
	int val;
	Linked_1 next = null;
	Linked_1(int v) {
	val = v;
	}
}

public class Linked {
		private Linked_1 head = null;
	
		public Linked() {
			
		}
		
		public int get(int index) {
			if (head == null) {
				return -1;
			}
			
			Linked_1 cur = head;
			for (int i=0; i< index; i++){
				if(cur.next == null){
					return -1;
				}
				cur= cur.next;
			}
			return cur.val;
	    }

	    public void addAtHead(int val) {
	    	if(head == null){
	    		head = new Linked_1(val);
	    		return;
	    	}
	    	Linked_1 node = new Linked_1(val);
	    	node.next = head;
	    	head = node;
	    }

	    public void addAtTail(int val) {
	    	if(head==null) {
	    		head = new Linked_1(val);
	    		return;
	    	}
	    	
	    	Linked_1 cur = head;
	    	while(cur.next !=null) {
	    		cur = cur.next;
	    	}
	    	Linked_1 node = new Linked_1(val);
	    	cur.next=node;
	    }

	    public void addAtIndex(int index, int val) {
	    	if(head==null) {
	    		head = new Linked_1(val);
	    		return;
	    	}
	    	Linked_1 prev = null;
	    	Linked_1 cur = head;
	    	for(int i=0; i<index; i++){
	    		if(cur == null){
	    			return;
	    		}
	    		prev = cur;
	    		cur = cur.next;
	    	}
	    	Linked_1 node = new Linked_1(val);
	    	if (prev ==null ){
	    		node.next = head;
	    		head = node;
	    	}
	    	else if (cur == null) {
	    		cur = node;
	    		prev.next = cur;
	    	}
	    	else {
	    		prev.next = node;
	    		node.next = cur;
	    	}
	    }

	    public void deleteAtIndex(int index) {
	    	if (head == null) {
	    		return;
	    	}
	    	Linked_1 prev = null;
	    	Linked_1 cur =head;
	    	for (int i =0; i<index; i++){
	    		if(cur.next == null){
	    			return;
	    		}
	    		prev = cur;
	    		cur = cur.next;
	    	}
	    	
	    	Linked_1 next = cur.next;
	    	if(prev == null) {
	    		head = head.next;
	    	}
	    	else if (next == null) {
	    		prev.next = null;
	    	}
	    	else {
	    		
	    		prev.next = next;
	    	}
	    }
	     
}