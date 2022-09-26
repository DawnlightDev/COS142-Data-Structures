/*The arrays in both the linear search test and sorting test outperformed the linked lists, however,
when it came to adding the 100 random elements, the linked lists outperformed the arrays by adding the 
elements in slighty faster than the arrays. Though I will mention that the time to perform all tests
between the linked lists and the arrays was extremely slight right down to thousands of a millisecond. I 
think when it came to adding the elements, the linked lists outperformed the arrays because a linked list
has a much simpler and easier way of adding a new element with just the add method while with an array, you have
to declare a new array that is just the old array plus new integers and this inefficiency is likely why the
linked lists outperformed the arrays in this particular test.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class LinkedList {
	LinkedList i = new LinkedList();

	public static void ArrayThousand() {
		Random r = new Random();
     	int[] integers = new int[1000];
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);
            
		for (int i = 0; i < 900; i++) {
                   integers[i] = r.nextInt(900);
        }
		for (int i = 0; i > 900; i++) {
				integers[i] = 0;
		}
            
			System.out.println(Arrays.toString(integers));
		
			for (int j = 0; j <=99; j++) {
				int searchNo = r.nextInt(99);
				for (int i = 0; i < integers.length; i++) {
					if (integers[i] == searchNo) {
						System.out.println(searchNo + " is found on index " + i);
						System.out.println("Time taken to complete linear search: " + duration + "ms");
						break;
					} else if (i == integers.length - 1) {
						System.out.println(searchNo + " is not found anywhere in this array!");
						System.out.println("Time taken to complete linear search: " + duration + "ms");
					}
				}

			}

			for (int s = 0; s <= 29; s++) {
				long startTime2 = System.nanoTime();
				long endTime2 = System.nanoTime();
				long duration2 = (endTime2 - startTime2/1000000);
				Arrays.sort(integers);
				System.out.println("Array successfully sorted! Here's the output: " + Arrays.toString(integers));
				System.out.println("Time taken to complete sort: " + duration2 + "ms");
			}

			for (int k = 0; k <= 99; k++) {
				int arr[] = integers; 
				int n = arr.length;
				int newArr[] = new int[n+1]; 
				int value = r.nextInt(); 

				long startTime3 = System.nanoTime();
				long endTime3 = System.nanoTime();
				long duration3 = (endTime3 - startTime3/1000000); 
     
				System.out.println(Arrays.toString(arr));  
				for(int i = 0; i<n; i++) {  
					newArr[i] = arr[i];  
				}  
				newArr[n] = value;  
				System.out.println("Array after adding elements: "+ Arrays.toString(newArr));
				System.out.println("Time taken to add elements: " + duration3 + "ms");   
			}
	}

	public static void ArrayTenThousand() {
		Random r = new Random();
		int[] integers = new int[10000];
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);

		for (int i = 0; i < 9900; i++){
			integers[i] = r.nextInt(9900);
		}
		for (int i = 0; i > 9900; i++) {
			integers[i] = 0;
		}

		System.out.println(Arrays.toString(integers));

		for (int j = 0; j <=99; j++) {
			int searchNo = r.nextInt(99);
			for (int i = 0; i < integers.length; i++) {
				if (integers[i] == searchNo) {
					System.out.println(searchNo + " is found on index " + i);
					System.out.println("Time taken to complete linear search: " + duration + "ms");
					break;
				} else if (i == integers.length - 1) {
					System.out.println(searchNo + " is not found anywhere in this array!");
					System.out.println("Time taken to complete linear search: " + duration + "ms");
				}
			}

		}

		for (int s = 0; s <= 29; s++) {
			long startTime2 = System.nanoTime();
	 		long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2/1000000);
			Arrays.sort(integers);
			System.out.println("Array successfully sorted! Here's the output: " + Arrays.toString(integers));
			System.out.println("Time taken to complete sort: " + duration2 + "ms");
		}

		for (int k = 0; k <= 99; k++) {
			int arr[] = integers; 
			int n = arr.length;
			int newArr[] = new int[n+1]; 
			int value = r.nextInt(); 

			long startTime3 = System.nanoTime();
			long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3/1000000); 
 
			System.out.println(Arrays.toString(arr));  
			for(int i = 0; i<n; i++) {  
				newArr[i] = arr[i];  
			}  
			newArr[n] = value;  
			System.out.println("Array after adding elements: "+ Arrays.toString(newArr));
			System.out.println("Time taken to add elements: " + duration3 + "ms");   
		}
	 }

	public static void ArrayHundredThousand() {
		Random r = new Random();
		int[] integers = new int[100000];
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);

		for (int i = 0; i < 99900; i++){
			integers[i] = r.nextInt(99900);
		}
		for (int i = 0; i > 99900; i++) {
			integers[i] = 0;
		}

		System.out.println(Arrays.toString(integers));

		for (int j = 0; j <=99; j++) {
			int searchNo = r.nextInt(99);
			for (int i = 0; i < integers.length; i++) {
				if (integers[i] == searchNo) {
					System.out.println(searchNo + " is found on index " + i);
					System.out.println("Time taken to complete linear search: " + duration + "ms");
					break;
				} else if (i == integers.length - 1) {
					System.out.println(searchNo + " is not found anywhere in this array!");
					System.out.println("Time taken to complete linear search: " + duration + "ms");
				}
			}

		}

		for (int s = 0; s <= 29; s++) {
			long startTime2 = System.nanoTime();
	 		long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2/1000000);
			Arrays.sort(integers);
			System.out.println("Array successfully sorted! Here's the output: " + Arrays.toString(integers));
			System.out.println("Time taken to complete sort: " + duration2 + "ms");
		}

		for (int k = 0; k <= 99; k++) {
			int arr[] = integers; 
			int n = arr.length;
			int newArr[] = new int[n+1]; 
			int value = r.nextInt(); 

			long startTime3 = System.nanoTime();
			long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3/1000000); 
	
			System.out.println(Arrays.toString(arr));  
			for(int i = 0; i<n; i++) {  
				newArr[i] = arr[i];  
			}  
			newArr[n] = value;  
			System.out.println("Array after adding elements: "+ Arrays.toString(newArr));
			System.out.println("Time taken to add elements: " + duration3 + "ms");   
		}

	}

	public static void LinkedListHundred() {
		java.util.LinkedList <Integer> l = new java.util.LinkedList<Integer>();
		Random r = new Random();
		int element = r.nextInt(899);
		int ans = -1;
		long startTime = System.nanoTime();
	 	long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);

		for (int i = 0; i <= 899; i++) {
			l.add(r.nextInt(899));
		}  
		System.out.print(l);
		System.out.println(l.size());

        for (int j = 0; j <= 100; j++) {
			for (int i = 0; i < l.size(); i++) {
				int Element = l.get(i);
				if (Element == element) {
					ans = i;
					break;
				}
			}
			if (ans == -1) {
				System.out.println("Element not found in this linked list!");
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}
			else {
				System.out.println("Element found in Linked List at " + ans);
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}

		}

		for (int s = 0; s <= 29; s++) {
			long startTime2 = System.nanoTime();
	 		long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2/1000000);
			Comparator<Integer> order = Integer::compare;
  			l.sort(order.reversed());
			System.out.println("Linked List has been sorted!: " + l);
			System.out.println("Time taken to complete sort: " + duration2 + "ms");
		}

		for (int k = 0; k <= 99; k++) {  
			long startTime3 = System.nanoTime();
	 		long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3/1000000);
			l.add(r.nextInt());
			System.out.println("Linked List has been modified!: " + l);
			System.out.println("Time taken to add new elements: " + duration3 + "ms");
		}
    }

	public static void LinkedListThousand() {
		java.util.LinkedList <Integer> l = new java.util.LinkedList<Integer>();
		Random r = new Random();
		int element = r.nextInt(899);
		int ans = -1;
		long startTime = System.nanoTime();
	 	long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);

		for (int i = 0; i <= 9899; i++) {
			l.add(r.nextInt(899));
		}  
		System.out.print(l);
		System.out.println(l.size());

		for (int j = 0; j <= 100; j++) {
			for (int i = 0; i < l.size(); i++) {
				int Element = l.get(i);
				if (Element == element) {
					ans = i;
					break;
				}
			}
			if (ans == -1) {
				System.out.println("Element not found in this linked list!");
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}
			else {
				System.out.println("Element found in Linked List at " + ans);
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}

		}

		for (int s = 0; s <= 29; s++) {
			long startTime2 = System.nanoTime();
	 		long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2/1000000);
			Comparator<Integer> order = Integer::compare;
  			l.sort(order.reversed());
			System.out.println("Linked List has been sorted!: " + l);
			System.out.println("Time taken to complete sort: " + duration2 + "ms");
		}

		for (int k = 0; k <= 99; k++) {  
			long startTime3 = System.nanoTime();
	 		long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3/1000000);
			l.add(r.nextInt());
			System.out.println("Linked List has been modified!: " + l);
			System.out.println("Time taken to add new elements: " + duration3 + "ms");
		}
	}

	public static void LinkedListHundredThousand() {
		java.util.LinkedList <Integer> l = new java.util.LinkedList<Integer>();
		Random r = new Random();
		int element = r.nextInt(899);
		int ans = -1;
		long startTime = System.nanoTime();
	 	long endTime = System.nanoTime();
		long duration = (endTime - startTime/1000000);

		for (int i = 0; i <= 99899; i++) {
			l.add(r.nextInt(899));
		}  
		System.out.print(l);
		System.out.println(l.size());

		for (int j = 0; j <= 100; j++) {
			for (int i = 0; i < l.size(); i++) {
				int Element = l.get(i);
				if (Element == element) {
					ans = i;
					break;
				}
			}
			if (ans == -1) {
				System.out.println("Element not found in this linked list!");
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}
			else {
				System.out.println("Element found in Linked List at " + ans);
				System.out.println("Time taken to complete linear search: " + duration + "ms");
			}

		}

		for (int s = 0; s <= 29; s++) {
			long startTime2 = System.nanoTime();
	 		long endTime2 = System.nanoTime();
			long duration2 = (endTime2 - startTime2/1000000);
			Comparator<Integer> order = Integer::compare;
  			l.sort(order.reversed());
			System.out.println("Linked List has been sorted!: " + l);
			System.out.println("Time taken to complete sort: " + duration2 + "ms");
		}

		for (int k = 0; k <= 99; k++) {  
			long startTime3 = System.nanoTime();
			long endTime3 = System.nanoTime();
			long duration3 = (endTime3 - startTime3/1000000);
			l.add(r.nextInt());
			System.out.println("Linked List has been modified!: " + l);
			System.out.println("Time taken to add new elements: " + duration3 + "ms");
		}

	}

	public static void main (String [] args) {
		ArrayThousand();
		ArrayTenThousand();
		ArrayHundredThousand();
		LinkedListHundred();
		LinkedListThousand();
		LinkedListHundredThousand();

	}
    
}
