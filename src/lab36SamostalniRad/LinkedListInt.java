package lab36SamostalniRad;

public class LinkedListInt {
	
	private Node head;
	private int size;
	
	public LinkedListInt()
	{
		this.head = null;
		this.size = 0; 
	}
	
	public void add(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			this.head = newNode;
			size++;
			return;
		}
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = newNode;
		size++;
	}
	
	public void add(int value, int index)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("Index not valid!");
		}
		int counter = 1;
		Node newNode = new Node(value);
		if (index == 0)
		{
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if (index == size)
		{
			add(value);
			return;
		}
		Node previous = head;
		while (counter < index)
		{
			previous = previous.next;
			counter++;
		}
		newNode.next = previous.next;
		size++;
		
	}
	
	public void printList()
	{
		Node current = head;
		while (current != null)
		{
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void removeAt(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index not valid!");
		}
		if (head.next == null)
		{
			head = null;
			size--;
			return;
		}
		if (index == 0)
		{
			head = head.next;
			size--;
			return;
		}
		int counter = 1;
		Node current = head.next;
		Node previous = head;
		while (counter < index)
		{
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
	}
	
	public int[] toArray()
	{
		Node current = head;
		int[] array = new int[size];
		int i = 0;
		while (i<size)
		{
			array[i] = current.value;
			current = current.next;
			i++;
		}
		return array;
	}
	
	public int getSize()
	{
		return size;
	}
	
	private class Node{
		
		public int value;
		public Node next;
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node (int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}

}
