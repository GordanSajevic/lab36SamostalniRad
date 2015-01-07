package lab36SamostalniRad;

public class Test {

	public static void main(String[] args) {
		
		LinkedListInt list = new LinkedListInt();
		for (int i=0; i<5; i++)
		{
			list.add(i+1);
		}
		list.printList();
		list.removeAt(2);
		System.out.println();
		list.printList();
		System.out.println();
		list.add(23, 1);
		list.printList();
		
		LinkedListInt list2 = new LinkedListInt();
		for (int i=6; i<=10; i++)
		{
			list.add(i);
		}
		list.add(list2);
		System.out.println();
		list.printList();
	}

}
