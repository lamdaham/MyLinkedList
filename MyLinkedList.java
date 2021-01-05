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
		element.setPrev(this.end);
		if (size==0) {
			this.start = element;
			this.end = element;
		}
		size++;
	}
	public boolean add(int index, String value);
	public String get(int index);
	public String set(int index, String value);
	public String toString();
	//Any helper method that returns a Node object MUST BE PRIVATE!
}