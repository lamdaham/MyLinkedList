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
		this.end = element;
		size++;
		return element.setPrev(this.end);
	}
	public boolean add(int index, String value){
		if (this.start != null) {
			Node element = new Node(value);
			Node prevNode = this.start;
			int counter = 0;
			while(counter<index-1) {
				prevNode = prevNode.getNext();
				counter++;
			}
			element.setNext(prevNode.getNext());
			return prevNode.setNext(element);
		} else {
			return add(value);
		}
	}
	public String get(int index){
		Node output = this.start;
		int counter = 0;
		while(counter<index) {
			output = output.getNext();
			counter++;
		}
		return output.getValue();
	}
	public String set(int index, String value) {
		Node changeNode = this.start;
		int counter = 0;
		while(counter<index) {
			changeNode = changeNode.getNext();
			counter++;
		}
		return(changeNode.setData(value));
	}

	public String toString(){
		String output = "[";
		int counter = 0;
		Node node = this.start;
		while(counter<size) {
			output += node.getValue() + ", ";
			node = node.getNext(); 
			counter++;
		}
		output = output.substring(0,(output.length()-3));
		output += "]";
		return output;
	}
	//Any helper method that returns a Node object MUST BE PRIVATE!
}