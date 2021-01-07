public class Node{
	private String data;
	private Node next,prev;
	public Node(String value){
		this.data = value;
		this.next = null;
		this.prev = null;
	}
	//write get/set methods for all three instance variables.
	public boolean setNext(Node index) {
		this.next = index;
		return true;
	}
	public boolean setPrev(Node index) {
		this.prev = index;
		return true;
	}
	public String setData(String element) {
		String p = this.data;
		this.data = element;
		return p;
	}


	public Node getNext() {
		return this.next;
	}
	public Node getPrev() {
		return this.prev;
	}
	public String getData() {
		return this.data;
	}

}