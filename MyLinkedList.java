public class MyLinkedList{
	private int size;
	private Node start,end;


	public MyLinkedList(){
		this.size = 0;
		this.start = null;
		this.end = null;
	}



	public int size() {
		return size;
	}



	public boolean add(String value){
		Node element = new Node(value);
		if (size==0) {
			this.start = element;
			this.end = element;
		}
		size++;
		element.setPrev(this.end);
		(this.end).setNext(element);
		this.end = element;
		return true;
	}



	public void add(int index, String value){
		if (index<0||index>this.size) {
			throw new IndexOutOfBoundsException();
		}
		if (this.start != null) {
			Node element = new Node(value);
			Node prevNode = this.start;
			if (index == this.size) {
				add(value);
			} else if (index != 0) {
				int counter = 0;
				while(counter<index-1) {
					prevNode = prevNode.getNext();
					counter++;
				}
				size++;
				element.setPrev(prevNode);
				element.setNext(prevNode.getNext());
				(prevNode.getNext()).setPrev(element);
				prevNode.setNext(element);
			} else {
				this.start = element;
				element.setNext(prevNode);
				size++;
			}
		} else {
			add(value);
		}
	}



	public String get(int index){
		if (index<0||index>=this.size) {
			throw new IndexOutOfBoundsException();
		}
		Node output = this.start;
		int counter = 0;
		while(counter<index) {
			output = output.getNext();
			counter++;
		}
		return output.getData();
	}



	public String set(int index, String value) {
		if (index<0||index>=this.size) {
			throw new IndexOutOfBoundsException();
		}
		Node changeNode = this.start;
		int counter = 0;
		while(counter<index) {
			changeNode = changeNode.getNext();
			counter++;
		}
		return(changeNode.setData(value));
	}



	public String remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		int counter = 0; 
		Node deleted = this.start;
		if (index == this.size-1) {
			this.end = (this.end).getPrev();
			(this.end).setNext(null);
		} else if (index == 0) {
			this.start = (this.start).getNext();
			(this.start).setPrev(null);
		} else {
			while (counter < index) {
				deleted = deleted.getNext();
				counter++;
			}
			(deleted.getNext()).setPrev(deleted.getPrev());
			(deleted.getPrev()).setNext(deleted.getNext());
		}
		size--;
		return deleted.getData();

	}


	public void extend(MyLinkedList other) {
		if (size != 0 && other.size != 0) {
			(this.end).setNext(other.start);
			this.end = other.end;
			this.size += other.size();
			other.start = null;
			other.end = null;
			other.size = 0;
		} else if (size == 0 && other.size != 0) {
			this.start = other.start;
			this.end = other.end;
			this.size = other.size;
			other.start = null;
			other.end = null;
			other.size = 0;
		}
	}


	public String toString(){
		String output = "[";
		int counter = 0;
		Node node = this.start;
		while(counter<size) {
			output += node.getData() + ", ";
			node = node.getNext(); 
			counter++;
		}
		if (output.length()>1) {
			output = output.substring(0,(output.length()-2));	
		}
		output += "]";
		return output;
	}

	public String toStringReversed() {
		Node current = end;
	    String ans = "[";
	    while(current != null){
	      ans += current.getData();
	      current = current.getPrev();
	      if(current!= null){
	        ans += ", ";
	      }
	      System.out.println(current.getData());
	    }
	    return ans + "]";
	}
	//Any helper method that returns a Node object MUST BE PRIVATE!
}