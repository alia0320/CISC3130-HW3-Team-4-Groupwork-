package IteratorsReview;

import java.util.ArrayList;
import java.util.Iterator;


public class T4Work {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		ArrayList<Integer> numCopy = (ArrayList<Integer>) numbers.clone();
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) { // check whether the ArrayList has another next after the current one by calling .hasNext()
			Integer current = iterator.next();
			if (current % 2 == 0) { // then use the if statement to check whether the next element is an even number
				iterator.remove(); // if it is, then remove that even number using the iterator to avoid exceptions
			}
		}
		System.out.println(numbers);
		numbers.add(0);	
		System.out.println(numbers);
		/* generics prevent runtime errors by telling the compiler that a collection is of a certain type, that way it notifies 
		 * the programmer that a type that they have put in is not supported. it also saves time with casting, as some types
		 * inherit from other types
		 * 
		 */
	}

}
