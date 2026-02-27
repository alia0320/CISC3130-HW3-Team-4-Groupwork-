Find and Replace Using Iterator (Java)
Overview

This exercise practices using an Iterator with a generic ArrayList<Integer>.
You will remove elements safely while iterating and understand why Java generics help prevent errors.

Task Setup

    Add 10 numbers.

Group Task

    Use an Iterator to remove all even numbers.
    Then add the value 0 to the list.
    Why must removal happen through the Iterator?
    How do generics prevent runtime errors here?

Critical Thinking

    What would happen if you removed items using numbers.remove() inside the loop?

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Questions and Answers
Question 1: Why must removal happen through the Iterator?

Removal must happen through the Iterator because the iterator keeps track of the collection's internal state during iteration.

If you remove elements directly from the list while iterating, the collection changes unexpectedly and Java throws a ConcurrentModificationException.

Using:

iterator.remove();

keeps the iteration consistent and safe.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Question 2: How do generics prevent runtime errors here?

The list is declared as:

ArrayList<Integer> numbers = new ArrayList<>();

Generics ensure:

Only Integer values can be added.

You cannot accidentally insert a different type like a String.

No casting is required when retrieving elements.

Example of something that would fail at compile time:

numbers.add("hello"); // Not allowed

Because of generics, many errors are caught before the program runs, reducing runtime crashes.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Critical Thinking
What would happen if you removed items using numbers.remove() inside the loop?

If you used something like this:

ArrayList<Integer> numCopy = (ArrayList<Integer>) numbers.clone();
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) { 
			if (current % 2 == 0) { 
				iterator.remove(); // Problem
			}
		}

This would likely cause a ConcurrentModificationException because:

The iterator expects the collection to remain unchanged except through it.remove().

Direct modification breaks the iterator's tracking of the list.

In short:

Removing with the iterator = safe

Removing directly from the list during iteration = unsafe
