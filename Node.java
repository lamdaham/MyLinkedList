public class Node{
	private String data;
	private Node next,prev;
	public Node(String value){
		this.data = value;
		this.next = null;
		this.prev = null;
	}
	//write get/set methods for all three instance variables.
	public static void setNext(Node index) {
		this.next = index;
	}
	public static void setPrev(Node index) {
		this.prev = index;
	}
	public static void setNext(String element) {
		this.data = element;
	}


	public static Node getNext() {
		return this.next;
	}
	public static Node getPrev() {
		return this.prev;
	}
	public static String getData() {
		return this.data;
	}

}