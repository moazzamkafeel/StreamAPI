package Collections.mk.diffreneces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {
	                                    
	public static void main(String[] args) {

//1. Access Time:

//ArrayList allows fast random access by index since it uses an array internally.
//LinkedList has slower access time as you need to traverse the linked nodes
//	to find an element.

		List<Integer> arrayList = new ArrayList<>();

		// Populate the list with numbers from 0 to 999999
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}

		long startTime = System.nanoTime();

		// Access elements by index faster
		int element = arrayList.get(500000);

		long endTime = System.nanoTime();
		long duration = endTime-startTime;

		System.out.println("Accessed element: " + element);
		System.out.println("Time taken for ArrayList access: " + duration + " nanoseconds");
//  LinkedList
		List<Integer> linkedList = new LinkedList<>();

		// Populate the list with numbers from 0 to 999999
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}

		long startTime1 = System.nanoTime();

		// Access elements by traversing the linked nodes
		int element1 = linkedList.get(500000);

		long endTime1 = System.nanoTime();
		long duration1 = endTime1 - startTime1;

		System.out.println("Accessed element: " + element1);
		System.out.println("Time taken for LinkedList access: " + duration1 + " nanoseconds");
		
//2.Insertions and Deletions:
//ArrayList can be slower for insertions and deletions since it might require shifting elements to accommodate the changes.
//LinkedList performs better for insertions and deletions since it involves changing pointers rather than shifting elements.
//		   List<Integer> arrayList2 = new ArrayList<>();
//
//	        long startTime2 = System.nanoTime();
//
//	        // Adding elements to the ArrayList
//	        for (int i = 0; i < 100000; i++) {
//	            arrayList2.add(i);
//	        }
//
//	        // Inserting an element at index 50000
//	        arrayList2.add(50000, -1);
//
//	        // Deleting an element at index 25000
//	        arrayList2.remove(25000);
//
//	        long endTime2 = System.nanoTime();
//	        long duration2 = endTime2 - startTime2;
//
//	        System.out.println("ArrayList after insertions and deletions: " + arrayList2);
//	        System.out.println("Time taken for ArrayList operations: " + duration2 + " nanoseconds");
//	    
//	        
//	        List<Integer> linkedList3 = new LinkedList<>();
//
//	        long startTime3 = System.nanoTime();
//
//	        // Adding elements to the LinkedList
//	        for (int i = 0; i < 100000; i++) {
//	            linkedList3.add(i);
//	        }
//
//	        // Inserting an element at the beginning
//	        ((LinkedList<Integer>) linkedList3).addFirst(-1);
//
//	        // Deleting an element from the middle
//	        linkedList3.remove(50000);
//
//	        long endTime3 = System.nanoTime();
//	        long duration3 = endTime3 - startTime3;
//
//	        System.out.println("LinkedList after insertions and deletions: " + linkedList3);
//	        System.out.println("Time taken for LinkedList operations: " + duration3 + " nanoseconds");
//
//	}
//	

//1. Access Time:
//ArrayList allows fast random access by index since it uses an array internally.
//LinkedList has slower access time as you need to traverse the linked nodes
//	to find an element.

//2. Insertions and Deletions: Manuplating
//ArrayList can be slower for insertions and deletions since it might require shifting elements to accommodate the changes.
//LinkedList performs better for insertions and deletions since it involves changing pointers rather than shifting elements.

//3. Memory Overhead:
//ArrayList generally has a slightly lower memory overhead due to its use of a single array.
//LinkedList has a higher memory overhead because it stores the elements and their associated pointers.

//4. Usage:
//Use ArrayList when you need fast random access and few insertions or deletions.
//Use LinkedList when you need frequent (Manuplation)insertions or deletions, especially in the middle of the list.
}}